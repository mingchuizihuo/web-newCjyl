package generate;



import java.util.List;

/**
 * Created by xiao on 2016/12/7.
 */
public class ResultMap {
    private String id;
    private String type;
    private ResultMapId resultMapId;
    private List<ResultResult> resultResults;
    private List<ResultAssociation> resultAssociations;
    private List<ResultCollection> resultCollections;
    private String baseColumnList;
    private String leftJoin;

    @Override
    public String toString() {
        return "ResultMap{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", resultMapId=" + resultMapId +
                ", resultResults=" + resultResults +
                ", resultAssociations=" + resultAssociations +
                ", resultCollections=" + resultCollections +
                ", baseColumnList='" + baseColumnList + '\'' +
                ", leftJoin='" + leftJoin + '\'' +
                '}';
    }

    public String getLeftJoin() {
        return leftJoin;
    }

    public void setLeftJoin(String leftJoin) {
        this.leftJoin = leftJoin;
    }

    public String getBaseColumnList() {
        return baseColumnList;
    }

    public void setBaseColumnList(String baseColumnList) {
        this.baseColumnList = baseColumnList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResultMapId getResultMapId() {
        return resultMapId;
    }

    public void setResultMapId(ResultMapId resultMapId) {
        this.resultMapId = resultMapId;
    }

    public List<ResultResult> getResultResults() {
        return resultResults;
    }

    public void setResultResults(List<ResultResult> resultResults) {
        this.resultResults = resultResults;
    }

    public List<ResultAssociation> getResultAssociations() {
        return resultAssociations;
    }

    public void setResultAssociations(List<ResultAssociation> resultAssociations) {
        this.resultAssociations = resultAssociations;
    }

    public List<ResultCollection> getResultCollections() {
        return resultCollections;
    }

    public void setResultCollections(List<ResultCollection> resultCollections) {
        this.resultCollections = resultCollections;
    }
}
