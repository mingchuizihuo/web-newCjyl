package generate;

/**
 * Created by xiao on 2016/12/7.
 */
public class ResultAssociation {
    private String propertyName;
    private String resultMapName;

    public ResultAssociation() {
    }

    public ResultAssociation(String propertyName, String resultMapName) {
        this.propertyName = propertyName;
        this.resultMapName = resultMapName;
    }

    @Override
    public String toString() {
        return "ResultAssociation{" +
                "propertyName='" + propertyName + '\'' +
                ", resultMapName='" + resultMapName + '\'' +
                '}';
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getResultMapName() {
        return resultMapName;
    }

    public void setResultMapName(String resultMapName) {
        this.resultMapName = resultMapName;
    }
}
