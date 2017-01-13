package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.Date;

public class Staff {
    private Long id;

    private Long organizationLoginId;

    private String name;

    private String cardId;

    private Long sex;

    private Date birthday;

    private Date entryDate;

    private Long branch;

    private Long duty;

    private Long healthState;

    private String tel;

    private Long marriage;

    private Long education;

    private Long major;

    private Integer salary;

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

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
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
        this.tel = tel == null ? null : tel.trim();
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
}