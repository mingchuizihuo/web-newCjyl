package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.Date;

public class OlderNurseLog {
    private Long id;

    private Long organizationLoginId;

    private Long olderId;

    private String physicalCondition;

    private String nurseInfo;

    private Date nurseDate;

    private Long staffId;

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

    public Long getOlderId() {
        return olderId;
    }

    public void setOlderId(Long olderId) {
        this.olderId = olderId;
    }

    public String getPhysicalCondition() {
        return physicalCondition;
    }

    public void setPhysicalCondition(String physicalCondition) {
        this.physicalCondition = physicalCondition == null ? null : physicalCondition.trim();
    }

    public String getNurseInfo() {
        return nurseInfo;
    }

    public void setNurseInfo(String nurseInfo) {
        this.nurseInfo = nurseInfo == null ? null : nurseInfo.trim();
    }

    public Date getNurseDate() {
        return nurseDate;
    }

    public void setNurseDate(Date nurseDate) {
        this.nurseDate = nurseDate;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }
}