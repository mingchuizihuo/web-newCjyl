package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.Date;

public class StaffLeaveLog {
    private Long id;

    private Long organizationLoginId;

    private Long staffId;

    private Date leaveDate;

    private String accountFor;

    private Long handleStaffId;

    private Date handleDate;

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

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getAccountFor() {
        return accountFor;
    }

    public void setAccountFor(String accountFor) {
        this.accountFor = accountFor == null ? null : accountFor.trim();
    }

    public Long getHandleStaffId() {
        return handleStaffId;
    }

    public void setHandleStaffId(Long handleStaffId) {
        this.handleStaffId = handleStaffId;
    }

    public Date getHandleDate() {
        return handleDate;
    }

    public void setHandleDate(Date handleDate) {
        this.handleDate = handleDate;
    }
}