package generate;

import java.util.List;

/**
 * Created by xiao on 2016/12/7.
 */
public class VO2XmlInfo {

    private String baseColumnList;

    private String leftInfo;
    private String exampleType;
    private List<ResultMap> resultMapList;


    @Override
    public String toString() {
        return "VO2XmlInfo{" +
                "baseColumnList='" + baseColumnList + '\'' +
                ", leftInfo='" + leftInfo + '\'' +
                ", exampleType='" + exampleType + '\'' +
                ", resultMapList=" + resultMapList +
                '}';
    }

    public String getExampleType() {
        return exampleType;
    }

    public void setExampleType(String exampleType) {
        this.exampleType = exampleType;
    }

    public String getBaseColumnList() {
        return baseColumnList;
    }

    public void setBaseColumnList(String baseColumnList) {
        this.baseColumnList = baseColumnList;
    }

    public String getLeftInfo() {
        return leftInfo;
    }

    public void setLeftInfo(String leftInfo) {
        this.leftInfo = leftInfo;
    }

    public List<ResultMap> getResultMapList() {
        return resultMapList;
    }

    public void setResultMapList(List<ResultMap> resultMapList) {
        this.resultMapList = resultMapList;
    }
}
