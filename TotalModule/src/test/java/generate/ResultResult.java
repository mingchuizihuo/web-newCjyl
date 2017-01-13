package generate;

/**
 * Created by xiao on 2016/12/7.
 */
public class ResultResult {

    private String columnName;
    private String propertyName;
    private String jdbcTypeName;


    public ResultResult() {
    }

    public ResultResult(String columnName, String propertyName, String jdbcTypeName) {
        this.columnName = columnName;
        this.propertyName = propertyName;
        this.jdbcTypeName = JDBCBeanTypeReturn.bean2JdbcType(jdbcTypeName);

    }

    @Override
    public String toString() {
        return "ResultResult{" +
                "columnName='" + columnName + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", jdbcTypeName='" + jdbcTypeName + '\'' +
                '}';
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getJdbcTypeName() {
        return jdbcTypeName;
    }

    public void setJdbcTypeName(String jdbcTypeName) {
        this.jdbcTypeName = jdbcTypeName;
    }
}
