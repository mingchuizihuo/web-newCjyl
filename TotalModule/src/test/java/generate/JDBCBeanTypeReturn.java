package generate;

/**
 * Created by xiao on 2016/12/7.
 */
public class JDBCBeanTypeReturn {
    public static String bean2JdbcType(String beanType){
            String JDBCType="";
            if(beanType.indexOf("String")!=-1){
                JDBCType = "VARCHAR";
            }else if(beanType.indexOf("Long")!=-1){
                JDBCType = "BIGINT";
            }else if(beanType.indexOf("Date")!=-1){
                JDBCType = "TIMESTAMP";
            }else if(beanType.indexOf("Byte")!=-1){
                JDBCType = "TINYINT";
            }else if(beanType.indexOf("Integer")!=-1){
                JDBCType = "INTEGER";
            }
        return JDBCType;
    }
}
