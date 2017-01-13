package generate;

import com.idea.cjyl.core.util.HumpAndCapital;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiao on 2016/12/7.
 */
public class VO2xml {


    public static void Generate(String ftlPath, String ftlName, String fileName, String filePath,String className,String daoPackageName,String daoFilePath) throws IOException, TemplateException, ClassNotFoundException {

        PathUtil.Path_Judge_Exist(ftlPath);
        PathUtil.Path_Judge_Exist(filePath);


        //实体类需要其他参数
        Map<String, Object> root = new HashMap<String, Object>();

        List<ResultMap> resultMaps = new ArrayList<>();
        resultMaps = getResultMap(className,resultMaps,"BaseResultMap");

        VO2XmlInfo vo2XmlInfo = new VO2XmlInfo();

        vo2XmlInfo.setResultMapList(resultMaps);
        vo2XmlInfo.setBaseColumnList(getBaseColumnList(resultMaps));
        vo2XmlInfo.setLeftInfo(getLeftInfo(resultMaps,className,true,""));
        if (className.indexOf("VO") != -1) {
            className = className.replace("vo","pojo");
            className = className.substring(0, className.length() - 2);

        }
        vo2XmlInfo.setExampleType(className+"Example");
        root.put("classNameExample",className.split("\\.")[className.split("\\.").length-1]+"Example");
        Configuration cfg = new Configuration();
        String path = System.getProperty("user.dir") + ftlPath;

        cfg.setDirectoryForTemplateLoading(new File(path));
        Template template = cfg.getTemplate(ftlName);
        Template daoTemplate = cfg.getTemplate("DaoMyself.ftl");
        root.put("fileName",fileName.split(",")[0]+"MapperMyself");
        root.put("className",className.split("\\.")[className.split("\\.").length-1]);
        root.put("daoPackageName",daoPackageName);

        PathUtil.printFile(root, template, filePath, fileName.split(",")[0]+"MapperMyself",vo2XmlInfo);

        PathUtil.printFileInter(root, daoTemplate, daoFilePath, fileName.split(",")[0]+"MapperMyself");
    }


    public static void main(String[] args) throws IOException, TemplateException, ClassNotFoundException {


        VO2xml.Generate(
                "\\TotalModule\\src\\test\\java\\ftl",
                "OlderMapperMyself.ftl",
                "ArrearageNote",
                "\\TotalModule\\src\\main\\java\\com\\idea\\cjyl\\totalmodule\\web\\mapper\\myself",
                "com.idea.cjyl.totalmodule.web.domain.vo.ArrearageNoteVO",

                "com.idea.cjyl.totalmodule.web.dao.myself",
                "\\TotalModule\\src\\main\\java\\com\\idea\\cjyl\\totalmodule\\web\\dao\\myself"
                );

    }












    /**
     * 获取baseColumList
     * @param resultMaps
     * @return
     */
    public static String getBaseColumnList(List<ResultMap> resultMaps){
        String baseColumnList = "";
        for (ResultMap resultMap: resultMaps) {
            baseColumnList+= resultMap.getBaseColumnList();
        }
        return baseColumnList.substring(0,baseColumnList.length()-2);
    }

    public static String getLeftInfo(List<ResultMap> resultMaps,String className,boolean auto,String leftInfo){
        if(auto){
            String[] strClassName = className.split("\\.");
            String objectNameVO = strClassName[strClassName.length - 1];
            String objectName = "";
            if (objectNameVO.indexOf("VO") != -1) {
                objectName = HumpAndCapital.hump2Capital(objectNameVO.substring(0, objectNameVO.length() - 2));

            } else {
                objectName = HumpAndCapital.hump2Capital(objectNameVO);

            }
            leftInfo="from "+objectName+" ";
            for(int i=resultMaps.size()-1;i>=0;i--){
                leftInfo+= resultMaps.get(i).getLeftJoin();
            }

        }


        return leftInfo;
    }



    public static List<ResultMap> getResultMap(String className, List<ResultMap> resultMaps,String idName) throws ClassNotFoundException {
        ResultMap resultMap = new ResultMap();
        String leftJoin="";
        String baseColumnList="";
        Class clazz = Class.forName(className);
        Method[] methods = clazz.getMethods();
        String[] strClassName = className.split("\\.");
        String objectNameVO = strClassName[strClassName.length - 1];
        String objectName = "";
        resultMap.setId(idName);
        resultMap.setType(className);




        if (objectNameVO.indexOf("VO") != -1) {
            objectName = HumpAndCapital.hump2Capital(objectNameVO.substring(0, objectNameVO.length() - 2));

        } else {
            objectName = HumpAndCapital.hump2Capital(objectNameVO);

        }

        String jdbcTableName = HumpAndCapital.hump2Capital(objectName);

        ResultMapId resultMapId = new ResultMapId(objectName + "_id");
        baseColumnList+=objectName+".id"+" "+objectName+"_id, ";
        resultMap.setResultMapId(resultMapId);
        List<ResultResult> resultResults = new ArrayList<>();
        List<ResultAssociation> resultAssociations = new ArrayList<>();
        List<ResultCollection> resultCollections = new ArrayList<>();
        for (int i = 0; i < methods.length; i++) {
            String methodName = methods[i].getName();
            if (methodName.indexOf("get") != -1 && !methodName.equals("getId") && methodName.indexOf("getClass")==-1) {

                Type type = methods[i].getGenericReturnType();
                String propertyName = methodName.substring(3, methodName.length()).substring(0,1).toLowerCase()+methodName.substring(3, methodName.length()).substring(1);
                String propertyNameHump = HumpAndCapital.hump2Capital(methodName.substring(3, methodName.length()));
                if((propertyNameHump.indexOf("_id")!=-1 && propertyNameHump.indexOf("organization_login")==-1 && propertyNameHump.indexOf("card_id")==-1)  ){

                    leftJoin += " LEFT JOIN "+propertyNameHump.substring(0,propertyNameHump.length()-3)+" ON "+jdbcTableName+"."+propertyNameHump+"="+propertyNameHump.substring(0,propertyNameHump.length()-3)+".id ";


                }

                if(methodName.indexOf("DateStr")!=-1 ){
                    baseColumnList+="date_format("+objectName+"."+propertyNameHump.substring(0,propertyNameHump.length()-4)+",'%Y年%m月%d日')"+" "+objectName+"_"+propertyNameHump+", ";
                }else if(propertyNameHump.split("_")[propertyNameHump.split("_").length-1].equals("str")){
                    baseColumnList+="(select data_dictionary.data_name FROM data_dictionary where data_dictionary.id = "+objectName+"."+propertyNameHump.substring(0,propertyNameHump.length()-4)+") "+objectName+"_"+propertyNameHump+", ";
                }else{
                    if (!(type.getTypeName().indexOf("lang") == -1
                            && !type.getTypeName().equals("byte")
                            && !type.getTypeName().equals("int")
                            && !type.getTypeName().equals("long")
                            && type.getTypeName().indexOf("Date")==-1)) {
                        baseColumnList += objectName + "." + propertyNameHump + " " + objectName + "_" + propertyNameHump + ", ";
                    }
                }

                if (type.getTypeName().indexOf("lang") == -1
                        && !type.getTypeName().equals("byte")
                        && !type.getTypeName().equals("int")
                        && !type.getTypeName().equals("long")
                        && type.getTypeName().indexOf("Date")==-1) {
                    /**
                     * 获取类型名称
                     */
                    String typeName = type.getTypeName();

                    if (type.getTypeName().indexOf("<") != -1) {

                        ResultCollection resultCollection = new ResultCollection(propertyName,methodName.substring(3, methodName.length())+strClassName[strClassName.length - 1]);
                        typeName = typeName.split("<")[1].replace(">", "");
                        resultCollections.add(resultCollection);
                    }else {
                        ResultAssociation resultAssociation = new ResultAssociation(propertyName,methodName.substring(3, methodName.length())+strClassName[strClassName.length - 1]);
                        resultAssociations.add(resultAssociation);
                    }
                    getResultMap(typeName, resultMaps,methodName.substring(3, methodName.length())+strClassName[strClassName.length - 1]);
                } else {

                    ResultResult resultResult = new ResultResult(objectName + "_" + propertyNameHump, propertyName, methods[i].getReturnType().getName());
                    resultResults.add(resultResult);

                }

            }

        }
        resultMap.setLeftJoin(leftJoin);
        resultMap.setBaseColumnList(baseColumnList);
        resultMap.setResultResults(resultResults);
        resultMap.setResultAssociations(resultAssociations);
        resultMap.setResultCollections(resultCollections);
        resultMaps.add(resultMap);
        return resultMaps;
    }


}
