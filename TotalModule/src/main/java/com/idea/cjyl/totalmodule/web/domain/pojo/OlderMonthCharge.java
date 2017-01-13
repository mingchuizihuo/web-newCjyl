package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.Date;

public class OlderMonthCharge {
    private Long id;

    private Long organizationLoginId;

    private Long olderId;

    private Long monthChargeId;

    private Date olderMonthChargeDate;

    private Date olderMonthChargeEndDate;

    private Long olderMonthChargeState;

    private Long olderMonthChargeEndType;

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

    public Long getMonthChargeId() {
        return monthChargeId;
    }

    public void setMonthChargeId(Long monthChargeId) {
        this.monthChargeId = monthChargeId;
    }

    public Date getOlderMonthChargeDate() {
        return olderMonthChargeDate;
    }

    public void setOlderMonthChargeDate(Date olderMonthChargeDate) {
        this.olderMonthChargeDate = olderMonthChargeDate;
    }

    public Date getOlderMonthChargeEndDate() {
        return olderMonthChargeEndDate;
    }

    public void setOlderMonthChargeEndDate(Date olderMonthChargeEndDate) {
        this.olderMonthChargeEndDate = olderMonthChargeEndDate;
    }

    public Long getOlderMonthChargeState() {
        return olderMonthChargeState;
    }

    public void setOlderMonthChargeState(Long olderMonthChargeState) {
        this.olderMonthChargeState = olderMonthChargeState;
    }

    public Long getOlderMonthChargeEndType() {
        return olderMonthChargeEndType;
    }

    public void setOlderMonthChargeEndType(Long olderMonthChargeEndType) {
        this.olderMonthChargeEndType = olderMonthChargeEndType;
    }
}