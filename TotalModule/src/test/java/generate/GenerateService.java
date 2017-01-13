package generate;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;



public class GenerateService {

    public static void Generate(String ftlPath, String ftlName,
                                String fileName, String filePath, String packageName,
                                String daopackageName, String modelpackageName) throws IOException, TemplateException {

        String ImplFilePath = filePath + "\\impl";
        PathUtil.Path_Judge_Exist(ftlPath);
        PathUtil.Path_Judge_Exist(filePath);
        PathUtil.Path_Judge_Exist(ImplFilePath);

        //实体类需要其他参数
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("modelpackageName", modelpackageName);
        root.put("daopackageName", daopackageName);
        root.put("packageName", packageName);

        if(fileName.split(",").length==1){
            root.put("className", fileName);
            root.put("level",false);
        }else{
            root.put("className", fileName.split(",")[0]);
            root.put("level",true);
            root.put("classLevelName",fileName.split(",")[1]);
            root.put("classTidName",fileName.split(",")[2]);
        }

        root.put("implflag", false);

        Configuration cfg = new Configuration();
        String path = System.getProperty("user.dir") + ftlPath;

        cfg.setDirectoryForTemplateLoading(new File(path));
        Template template = cfg.getTemplate(ftlName);

        PathUtil.printFile(root, template, filePath, fileName.split(",")[0] + "Service");

        //生成Impl文件
        root.put("ImplpackageName", packageName + "." + fileName.split(",")[0] + "Service");
        root.put("packageName", packageName + ".impl");
        root.put("implflag", true);
        PathUtil.printFile(root, template, ImplFilePath, fileName.split(",")[0] + "ServiceImpl");

    }

    public static void main(String[] args) throws IOException, TemplateException {


        String[] fileNames = new String[]{
                /*"OrganizationLogin",
                "DataDictionary,DataLevel,Tid",
                "MonthCharge",
                "CheckInInitCost",
                "ServiceCharge",
                "Mansion",
                "FloorTier",
                "Room",
                "Bed",
                "Staff",
                "StaffLeaveLog",
                "Older",
                "OlderKinsfolk",
                "OlderInitialFee",
                "OlderNurseLog",
                "OlderCost",
*/
                "OrganizationLogin",
                "Login"


        };
        for (String fileName : fileNames
                ) {
            GenerateService.Generate(
                    "\\TotalModule\\src\\test\\java\\ftl",
                    "service.ftl",
                    fileName,
                    "\\TotalModule\\src\\main\\java\\com\\idea\\cjyl\\totalmodule\\web\\service",

						"com.idea.cjyl.totalmodule.web.service",
						"com.idea.cjyl.totalmodule.web.dao",
						"com.idea.cjyl.totalmodule.web.domain.pojo"

            );
        }

    }


}
