package generate;

/**
 * Created by xiao on 2016/12/7.
 */
public class ResultMapId {

    private String columnName;
    private String propertyName;
    private String jdbcTypeName;

    public ResultMapId() {
    }

    public ResultMapId(String columnName) {
        this.columnName = columnName;
        this.propertyName = "id";
        this.jdbcTypeName = "BIGINT";
    }

    public ResultMapId(String columnName, String propertyName, String jddbcTypeName) {
        this.columnName = columnName;
        this.propertyName = propertyName;
        this.jdbcTypeName = jddbcTypeName;
    }

    @Override
    public String toString() {
        return "ResultMapId{" +
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
