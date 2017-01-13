package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.DataDictionary;
import com.idea.cjyl.totalmodule.web.globals.AnalysisConstant;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/12/6.
 */
public class StaffVO {

    private Long id;

    private Long organizationLoginId;

    private String name;

    private String cardId;

    private Long sex;

    private String birthday;

    private String entryDate;

    private Long branch;

    private Long duty;

    private Long healthState;

    private String tel;

    private Long marriage;

    private Long education;

    private Long major;

    private Integer salary;

    private String sexStr;
    private String branchStr;
    private String dutyStr;
    private String healthStateStr;
    private String marriageStr;
    private String educationStr;
    private String majorStr;



    public void data2String(List<DataDictionary> dataDictionaryList){
        for (DataDictionary dataDictionary: dataDictionaryList
                ) {
            if(dataDictionary.getId()==this.getSex()){
                this.sexStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getBranch()){
                this.branchStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getDuty()){
                this.dutyStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getHealthState()){
                this.healthStateStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getMarriage()){
                this.marriageStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getEducation()){
                this.educationStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getMajor()){
                this.majorStr = dataDictionary.getDataName();
            }
        }

    }

    @Override
    public String toString() {
        return "StaffVO{" +
                "id=" + id +
                ", organizationLoginId=" + organizationLoginId +
                ", name='" + name + '\'' +
                ", cardId='" + cardId + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", entryDate=" + entryDate +
                ", branch=" + branch +
                ", duty=" + duty +
                ", healthState=" + healthState +
                ", tel='" + tel + '\'' +
                ", marriage=" + marriage +
                ", education=" + education +
                ", major=" + major +
                ", salary=" + salary +
                ", sexStr='" + sexStr + '\'' +
                ", branchStr='" + branchStr + '\'' +
                ", dutyStr='" + dutyStr + '\'' +
                ", healthStateStr='" + healthStateStr + '\'' +
                ", marriageStr='" + marriageStr + '\'' +
                ", educationStr='" + educationStr + '\'' +
                ", majorStr='" + majorStr + '\'' +
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
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public Long getBranch() {
        return branch;
    }

    public void setBranch(Long branch) {
        this.branch = branch;
    }

    public Long getDuty() {
        return duty;
    }

    public void setDuty(Long duty) {
        this.duty = duty;
    }

    public Long getHealthState() {
        return healthState;
    }

    public void setHealthState(Long healthState) {
        this.healthState = healthState;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Long getMarriage() {
        return marriage;
    }

    public void setMarriage(Long marriage) {
        this.marriage = marriage;
    }

    public Long getEducation() {
        return education;
    }

    public void setEducation(Long education) {
        this.education = education;
    }

    public Long getMajor() {
        return major;
    }

    public void setMajor(Long major) {
        this.major = major;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getSexStr() {
        return sexStr;
    }

    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
    }

    public String getBranchStr() {
        return branchStr;
    }

    public void setBranchStr(String branchStr) {
        this.branchStr = branchStr;
    }

    public String getDutyStr() {
        return dutyStr;
    }

    public void setDutyStr(String dutyStr) {
        this.dutyStr = dutyStr;
    }

    public String getHealthStateStr() {
        return healthStateStr;
    }

    public void setHealthStateStr(String healthStateStr) {
        this.healthStateStr = healthStateStr;
    }

    public String getMarriageStr() {
        return marriageStr;
    }

    public void setMarriageStr(String marriageStr) {
        this.marriageStr = marriageStr;
    }

    public String getEducationStr() {
        return educationStr;
    }

    public void setEducationStr(String educationStr) {
        this.educationStr = educationStr;
    }

    public String getMajorStr() {
        return majorStr;
    }

    public void setMajorStr(String majorStr) {
        this.majorStr = majorStr;
    }
}
