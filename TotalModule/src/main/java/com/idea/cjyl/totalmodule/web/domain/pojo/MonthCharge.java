package com.idea.cjyl.totalmodule.web.domain.pojo;

public class MonthCharge {
    private Long id;

    private Long organizationLoginId;

    private String nursingGrades;

    private Integer administrativeFee;

    private Integer serviceCharge;

    private Integer bedCost;

    private Integer foodCost;

    private Integer total;

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

    public String getNursingGrades() {
        return nursingGrades;
    }

    public void setNursingGrades(String nursingGrades) {
        this.nursingGrades = nursingGrades == null ? null : nursingGrades.trim();
    }

    public Integer getAdministrativeFee() {
        return administrativeFee;
    }

    public void setAdministrativeFee(Integer administrativeFee) {
        this.administrativeFee = administrativeFee;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Integer getBedCost() {
        return bedCost;
    }

    public void setBedCost(Integer bedCost) {
        this.bedCost = bedCost;
    }

    public Integer getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(Integer foodCost) {
        this.foodCost = foodCost;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}