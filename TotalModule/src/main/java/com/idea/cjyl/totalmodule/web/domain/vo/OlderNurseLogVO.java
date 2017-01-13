package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.Staff;

import java.util.Date;

public class OlderNurseLogVO {
    private Long id;

    private Long organizationLoginId;

    private Long olderId;

    private String physicalCondition;

    private String nurseInfo;

    private Date nurseDate;

    private Long staffId;

    private Staff staff;

    private String nurseDateStr;

    @Override
    public String toString() {
        return "OlderNurseLogVO{" +
                "id=" + id +
                ", organizationLoginId=" + organizationLoginId +
                ", olderId=" + olderId +
                ", physicalCondition='" + physicalCondition + '\'' +
                ", nurseInfo='" + nurseInfo + '\'' +
                ", nurseDate=" + nurseDate +
                ", staffId=" + staffId +
                ", staff=" + staff +
                ", nurseDateStr='" + nurseDateStr + '\'' +
                '}';
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getNurseDateStr() {
        return nurseDateStr;
    }

    public void setNurseDateStr(String nurseDateStr) {
        this.nurseDateStr = nurseDateStr;
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