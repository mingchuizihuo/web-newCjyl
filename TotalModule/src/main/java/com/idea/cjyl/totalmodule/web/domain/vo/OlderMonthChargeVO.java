package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.MonthCharge;
import com.idea.cjyl.totalmodule.web.domain.pojo.Older;

import java.util.Date;

public class OlderMonthChargeVO {
    private Long id;

    private Long organizationLoginId;

    private Long olderId;

    private Long monthChargeId;

    private Date olderMonthChargeDate;

    private Date olderMonthChargeEndDate;

    private Long olderMonthChargeState;

    private Long olderMonthChargeEndType;

    private MonthCharge monthCharge;

    private Older older;
    private String olderMonthChargeDateStr;

    private String olderMonthChargeEndDateStr;

    private String olderMonthChargeStateStr;

    private String olderMonthChargeEndTypeStr;


    @Override
    public String toString() {
        return "OlderMonthChargeVO{" +
                "id=" + id +
                ", organizationLoginId=" + organizationLoginId +
                ", olderId=" + olderId +
                ", monthChargeId=" + monthChargeId +
                ", olderMonthChargeDate=" + olderMonthChargeDate +
                ", olderMonthChargeEndDate=" + olderMonthChargeEndDate +
                ", olderMonthChargeState=" + olderMonthChargeState +
                ", olderMonthChargeEndType=" + olderMonthChargeEndType +
                ", monthCharge=" + monthCharge +
                ", older=" + older +
                ", olderMonthChargeDateStr='" + olderMonthChargeDateStr + '\'' +
                ", olderMonthChargeEndDateStr='" + olderMonthChargeEndDateStr + '\'' +
                ", olderMonthChargeStateStr='" + olderMonthChargeStateStr + '\'' +
                ", olderMonthChargeEndTypeStr='" + olderMonthChargeEndTypeStr + '\'' +
                '}';
    }

    public Older getOlder() {
        return older;
    }

    public void setOlder(Older older) {
        this.older = older;
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

    public MonthCharge getMonthCharge() {
        return monthCharge;
    }

    public void setMonthCharge(MonthCharge monthCharge) {
        this.monthCharge = monthCharge;
    }

    public String getOlderMonthChargeDateStr() {
        return olderMonthChargeDateStr;
    }

    public void setOlderMonthChargeDateStr(String olderMonthChargeDateStr) {
        this.olderMonthChargeDateStr = olderMonthChargeDateStr;
    }

    public String getOlderMonthChargeEndDateStr() {
        return olderMonthChargeEndDateStr;
    }

    public void setOlderMonthChargeEndDateStr(String olderMonthChargeEndDateStr) {
        this.olderMonthChargeEndDateStr = olderMonthChargeEndDateStr;
    }

    public String getOlderMonthChargeStateStr() {
        return olderMonthChargeStateStr;
    }

    public void setOlderMonthChargeStateStr(String olderMonthChargeStateStr) {
        this.olderMonthChargeStateStr = olderMonthChargeStateStr;
    }

    public String getOlderMonthChargeEndTypeStr() {
        return olderMonthChargeEndTypeStr;
    }

    public void setOlderMonthChargeEndTypeStr(String olderMonthChargeEndTypeStr) {
        this.olderMonthChargeEndTypeStr = olderMonthChargeEndTypeStr;
    }
}