package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.DataDictionary;
import com.idea.cjyl.totalmodule.web.domain.pojo.MonthCharge;
import com.idea.cjyl.totalmodule.web.domain.pojo.Staff;
import com.idea.cjyl.totalmodule.web.globals.AnalysisConstant;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/12/5.
 */
public class OlderVO {


    private Long id;

    private Long organizationLoginId;

    private String name;

    private Long sex;

    private String checkInDate;

    private String cardId;

    private String birthday;

    private String tel;

    private Long monthChargeId;

    private String censusRegister;

    private Long belief;

    private Long nation;

    private Long politicsStatus;

    private Long selfIngredient;

    private Long takeCareOfOneself;

    private Long mind;

    private String pluse;

    private String bloodPressure;

    private String allergicDrug;

    private String indicationHospital;

    private String indicationDoctor;

    private String principalDisease;

    private String diseasesHistory;

    private String hospitalTel;

    private String dietCharacteristics;

    private String disposition;

    private String hobby;

    private String specialRequirements;

    private String abnormalPatterns;
    private Byte olderState;

    private String olderLeaveDate;

    private String sexStr;//性别中文
    private MonthCharge monthCharge;//月收费对象
    private String beliefStr;//信仰
    private String nationStr;//民族
    private String politicsStatusStr;//政治面貌
    private String selfIngredientStr;//本人成分
    private String takeCareOfOneselfStr;//自理情况
    private String mindStr;//神志
    private Staff staff;//护理人员

    public OlderVO() {
    }

    public void data2String(List<DataDictionary> dataDictionaryList){
        for (DataDictionary dataDictionary: dataDictionaryList
             ) {
            if(dataDictionary.getId()==this.getSex()){
                this.sexStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getBelief()){
                this.beliefStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getNation()){
                this.nationStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getPoliticsStatus()){
                this.politicsStatusStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getSelfIngredient()){
                this.selfIngredientStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getTakeCareOfOneself()){
                this.takeCareOfOneselfStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getMind()){
                this.mindStr = dataDictionary.getDataName();
            }
        }

    }

    @Override
    public String toString() {
        return "OlderVO{" +
                "id=" + id +
                ", organizationLoginId=" + organizationLoginId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", checkInDate=" + checkInDate +
                ", cardId='" + cardId + '\'' +
                ", birthday=" + birthday +
                ", tel='" + tel + '\'' +
                ", monthChargeId=" + monthChargeId +
                ", censusRegister='" + censusRegister + '\'' +
                ", belief=" + belief +
                ", nation=" + nation +
                ", politicsStatus=" + politicsStatus +
                ", selfIngredient=" + selfIngredient +
                ", takeCareOfOneself=" + takeCareOfOneself +
                ", mind=" + mind +
                ", pluse='" + pluse + '\'' +
                ", bloodPressure='" + bloodPressure + '\'' +
                ", allergicDrug='" + allergicDrug + '\'' +
                ", indicationHospital='" + indicationHospital + '\'' +
                ", indicationDoctor='" + indicationDoctor + '\'' +
                ", principalDisease='" + principalDisease + '\'' +
                ", diseasesHistory='" + diseasesHistory + '\'' +
                ", hospitalTel='" + hospitalTel + '\'' +
                ", dietCharacteristics='" + dietCharacteristics + '\'' +
                ", disposition='" + disposition + '\'' +
                ", hobby='" + hobby + '\'' +
                ", specialRequirements='" + specialRequirements + '\'' +
                ", abnormalPatterns='" + abnormalPatterns + '\'' +
                ", olderState=" + olderState +
                ", olderLeaveDate=" + olderLeaveDate +
                ", sexStr='" + sexStr + '\'' +
                ", monthCharge=" + monthCharge +
                ", beliefStr='" + beliefStr + '\'' +
                ", nationStr='" + nationStr + '\'' +
                ", politicsStatusStr='" + politicsStatusStr + '\'' +
                ", selfIngredientStr='" + selfIngredientStr + '\'' +
                ", takeCareOfOneselfStr='" + takeCareOfOneselfStr + '\'' +
                ", mindStr='" + mindStr + '\'' +
                ", staff=" + staff +
                '}';
    }


    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrganizationLoginId() {
        return organizationLoginId;
    }

    public void setOrganizationLoginId(Long organizationLoginId) {
        this.organizationLoginId = organizationLoginId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Long getMonthChargeId() {
        return monthChargeId;
    }

    public void setMonthChargeId(Long monthChargeId) {
        this.monthChargeId = monthChargeId;
    }

    public String getCensusRegister() {
        return censusRegister;
    }

    public void setCensusRegister(String censusRegister) {
        this.censusRegister = censusRegister;
    }

    public Long getBelief() {
        return belief;
    }

    public void setBelief(Long belief) {
        this.belief = belief;
    }

    public Long getNation() {
        return nation;
    }

    public void setNation(Long nation) {
        this.nation = nation;
    }

    public Long getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(Long politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public Long getSelfIngredient() {
        return selfIngredient;
    }

    public void setSelfIngredient(Long selfIngredient) {
        this.selfIngredient = selfIngredient;
    }

    public Long getTakeCareOfOneself() {
        return takeCareOfOneself;
    }

    public void setTakeCareOfOneself(Long takeCareOfOneself) {
        this.takeCareOfOneself = takeCareOfOneself;
    }

    public Long getMind() {
        return mind;
    }

    public void setMind(Long mind) {
        this.mind = mind;
    }

    public String getPluse() {
        return pluse;
    }

    public void setPluse(String pluse) {
        this.pluse = pluse;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getAllergicDrug() {
        return allergicDrug;
    }

    public void setAllergicDrug(String allergicDrug) {
        this.allergicDrug = allergicDrug;
    }

    public String getIndicationHospital() {
        return indicationHospital;
    }

    public void setIndicationHospital(String indicationHospital) {
        this.indicationHospital = indicationHospital;
    }

    public String getIndicationDoctor() {
        return indicationDoctor;
    }

    public void setIndicationDoctor(String indicationDoctor) {
        this.indicationDoctor = indicationDoctor;
    }

    public String getPrincipalDisease() {
        return principalDisease;
    }

    public void setPrincipalDisease(String principalDisease) {
        this.principalDisease = principalDisease;
    }

    public String getDiseasesHistory() {
        return diseasesHistory;
    }

    public void setDiseasesHistory(String diseasesHistory) {
        this.diseasesHistory = diseasesHistory;
    }

    public String getHospitalTel() {
        return hospitalTel;
    }

    public void setHospitalTel(String hospitalTel) {
        this.hospitalTel = hospitalTel;
    }

    public String getDietCharacteristics() {
        return dietCharacteristics;
    }

    public void setDietCharacteristics(String dietCharacteristics) {
        this.dietCharacteristics = dietCharacteristics;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(String specialRequirements) {
        this.specialRequirements = specialRequirements;
    }

    public String getAbnormalPatterns() {
        return abnormalPatterns;
    }

    public void setAbnormalPatterns(String abnormalPatterns) {
        this.abnormalPatterns = abnormalPatterns;
    }

    public Byte getOlderState() {
        return olderState;
    }

    public void setOlderState(Byte olderState) {
        this.olderState = olderState;
    }

    public String getOlderLeaveDate() {
        return olderLeaveDate;
    }

    public void setOlderLeaveDate(String olderLeaveDate) {
        this.olderLeaveDate = olderLeaveDate;
    }

    public String getSexStr() {
        return sexStr;
    }

    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
    }

    public MonthCharge getMonthCharge() {
        return monthCharge;
    }

    public void setMonthCharge(MonthCharge monthCharge) {
        this.monthCharge = monthCharge;
    }

    public String getBeliefStr() {
        return beliefStr;
    }

    public void setBeliefStr(String beliefStr) {
        this.beliefStr = beliefStr;
    }

    public String getNationStr() {
        return nationStr;
    }

    public void setNationStr(String nationStr) {
        this.nationStr = nationStr;
    }

    public String getPoliticsStatusStr() {
        return politicsStatusStr;
    }

    public void setPoliticsStatusStr(String politicsStatusStr) {
        this.politicsStatusStr = politicsStatusStr;
    }

    public String getSelfIngredientStr() {
        return selfIngredientStr;
    }

    public void setSelfIngredientStr(String selfIngredientStr) {
        this.selfIngredientStr = selfIngredientStr;
    }

    public String getTakeCareOfOneselfStr() {
        return takeCareOfOneselfStr;
    }

    public void setTakeCareOfOneselfStr(String takeCareOfOneselfStr) {
        this.takeCareOfOneselfStr = takeCareOfOneselfStr;
    }

    public String getMindStr() {
        return mindStr;
    }

    public void setMindStr(String mindStr) {
        this.mindStr = mindStr;
    }
}
