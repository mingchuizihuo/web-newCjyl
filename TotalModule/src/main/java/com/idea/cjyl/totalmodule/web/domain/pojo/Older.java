package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.Date;

public class Older {
    private Long id;

    private Long organizationLoginId;

    private String name;

    private Long sex;

    private Date checkInDate;

    private String cardId;

    private Date birthday;

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

    private Date olderLeaveDate;

    private Long staffId;

    @Override
    public String toString() {
        return "Older{" +
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
                ", staffId=" + staffId +
                '}';
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
        this.name = name == null ? null : name.trim();
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
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
        this.censusRegister = censusRegister == null ? null : censusRegister.trim();
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
        this.pluse = pluse == null ? null : pluse.trim();
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure == null ? null : bloodPressure.trim();
    }

    public String getAllergicDrug() {
        return allergicDrug;
    }

    public void setAllergicDrug(String allergicDrug) {
        this.allergicDrug = allergicDrug == null ? null : allergicDrug.trim();
    }

    public String getIndicationHospital() {
        return indicationHospital;
    }

    public void setIndicationHospital(String indicationHospital) {
        this.indicationHospital = indicationHospital == null ? null : indicationHospital.trim();
    }

    public String getIndicationDoctor() {
        return indicationDoctor;
    }

    public void setIndicationDoctor(String indicationDoctor) {
        this.indicationDoctor = indicationDoctor == null ? null : indicationDoctor.trim();
    }

    public String getPrincipalDisease() {
        return principalDisease;
    }

    public void setPrincipalDisease(String principalDisease) {
        this.principalDisease = principalDisease == null ? null : principalDisease.trim();
    }

    public String getDiseasesHistory() {
        return diseasesHistory;
    }

    public void setDiseasesHistory(String diseasesHistory) {
        this.diseasesHistory = diseasesHistory == null ? null : diseasesHistory.trim();
    }

    public String getHospitalTel() {
        return hospitalTel;
    }

    public void setHospitalTel(String hospitalTel) {
        this.hospitalTel = hospitalTel == null ? null : hospitalTel.trim();
    }

    public String getDietCharacteristics() {
        return dietCharacteristics;
    }

    public void setDietCharacteristics(String dietCharacteristics) {
        this.dietCharacteristics = dietCharacteristics == null ? null : dietCharacteristics.trim();
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition == null ? null : disposition.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(String specialRequirements) {
        this.specialRequirements = specialRequirements == null ? null : specialRequirements.trim();
    }

    public String getAbnormalPatterns() {
        return abnormalPatterns;
    }

    public void setAbnormalPatterns(String abnormalPatterns) {
        this.abnormalPatterns = abnormalPatterns == null ? null : abnormalPatterns.trim();
    }

    public Byte getOlderState() {
        return olderState;
    }

    public void setOlderState(Byte olderState) {
        this.olderState = olderState;
    }

    public Date getOlderLeaveDate() {
        return olderLeaveDate;
    }

    public void setOlderLeaveDate(Date olderLeaveDate) {
        this.olderLeaveDate = olderLeaveDate;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }
}