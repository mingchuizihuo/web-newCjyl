package com.idea.cjyl.totalmodule.web.interceptor;

import com.github.pagehelper.Page;
import com.idea.cjyl.totalmodule.web.domain.pojo.Login;
import com.idea.cjyl.totalmodule.web.globals.AnalysisConstant;
import net.sf.json.JSON;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.SimpleStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.scripting.xmltags.DynamicContext;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Properties;

/**
 * Created by Administrator on 2016/12/5.
 */

@Intercepts({@Signature(type=StatementHandler.class,method="prepare",args={Connection.class})})

public class MybataisLoginIdInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        RoutingStatementHandler statementHandler = (RoutingStatementHandler)invocation.getTarget();

        StatementHandler delegate = (StatementHandler) getFieldValue(statementHandler, "delegate");

        BoundSql boundSql = delegate.getBoundSql();
        Object obj = boundSql.getParameterObject();

            MappedStatement mappedStatement = (MappedStatement)getFieldValue(delegate, "mappedStatement");

            //获取当前要执行的Sql语句，也就是我们直接在Mapper映射语句中写的Sql语句
            String sql = boundSql.getSql();


            String LoginSql =  loginIdSql(sql);
            //通过反射把要执行的sql语句添加登录筛选条件
            setFieldValue(boundSql, "sql", LoginSql);


        return invocation.proceed();

}

    public static String loginIdSql(String sql){

        String prefix=null;
        String fromTable=null;
        String suffix = null;

        if(sql.indexOf("ys_")!=-1){
            return sql;
        }
        if(sql.indexOf("insert into")!=-1 || sql.indexOf("INSERT INTO")!=-1 ){
            return sql;
        }
        if(AnalysisConstant.selectState != 3){
            return sql;
        }
        if((sql.indexOf("SELECT")!=-1 || sql.indexOf("select")!=-1)){


            if(sql.indexOf("count(*)")!=-1){


                    String[] sqlArray = sql.split(sql.substring(16,20));
                    prefix = sqlArray[0];
                    for(int i=1;i<sqlArray.length-1;i++){
                        prefix+=" "+sql.substring(16,20)+" "+sqlArray[i];

                    }
                    fromTable = sqlArray[sqlArray.length-1].split(" ")[1];

                    suffix = sqlArray[sqlArray.length-1].substring(fromTable.length()+1);

            }else{

                prefix = sql.split("from")[0];
                fromTable = sql.split("from")[1].split(" ")[1];
                suffix = sql.split("from")[1].substring(fromTable.length()+1);
            }


            Login login = AnalysisConstant.login;

            //fromTable = "from (select * from "+fromTable+" where organization_login_id = "+login.getOrganizationLoginId()+") "+fromTable+" ";
            fromTable = "from (select * from "+fromTable+" where organization_login_id = "+1+") "+fromTable+" ";

            return prefix+fromTable+suffix;
        }else{
            return sql;
        }

    }


    public static Object getFieldValue(Object obj , String fieldName ){

        if(obj == null){
            return null ;
        }

        Field targetField = getTargetField(obj.getClass(), fieldName);

        try {
            return FieldUtils.readField(targetField, obj, true ) ;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null ;
    }

    public static Field getTargetField(Class<?> targetClass, String fieldName) {
        Field field = null;

        try {
            if (targetClass == null) {
                return field;
            }

            if (Object.class.equals(targetClass)) {
                return field;
            }

            field = FieldUtils.getDeclaredField(targetClass, fieldName, true);
            if (field == null) {
                field = getTargetField(targetClass.getSuperclass(), fieldName);
            }
        } catch (Exception e) {
        }

        return field;
    }

    public static void setFieldValue(Object obj , String fieldName , Object value ){
        if(null == obj){return;}
        Field targetField = getTargetField(obj.getClass(), fieldName);
        try {
            FieldUtils.writeField(targetField, obj, value) ;

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Object plugin(Object arg0) {

        // TODO Auto-generated method stub
        if (arg0 instanceof StatementHandler) {
            return Plugin.wrap(arg0, this);
        } else {
            return arg0;
        }

    }

    @Override
    public void setProperties(Properties properties) {
        System.out.println(properties);
    }
}
