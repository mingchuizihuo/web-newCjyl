package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.CheckInInitCost;
import com.idea.cjyl.totalmodule.web.domain.pojo.Older;

import java.util.Date;
import java.util.List;

public class OlderInitialFeeVO {
    private Long id;

    private Long organizationLoginId;

    private Long olderId;

    private Long checkInInitCostId;

    private Long checkInInitCostState;

    private Date initialFeeDate;

    private Date closeAnAccountDate;

    private String checkInInitCostStateStr;

    private Older older;

    private List<CheckInInitCost> checkInInitCostList;
    private String initialFeeDateStr;
    private String closeAnAccountDateStr;


    @Override
    public String toString() {
        return "OlderInitialFeeVO{" +
                "id=" + id +
                ", organizationLoginId=" + organizationLoginId +
                ", olderId=" + olderId +
                ", checkInInitCostId=" + checkInInitCostId +
                ", checkInInitCostState=" + checkInInitCostState +
                ", initialFeeDate=" + initialFeeDate +
                ", closeAnAccountDate=" + closeAnAccountDate +
                ", checkInInitCostStateStr='" + checkInInitCostStateStr + '\'' +
                ", older=" + older +
                ", checkInInitCostList=" + checkInInitCostList +
                ", initialFeeDateStr='" + initialFeeDateStr + '\'' +
                ", closeAnAccountDateStr='" + closeAnAccountDateStr + '\'' +
                '}';
    }

    public String getInitialFeeDateStr() {
        return initialFeeDateStr;
    }

    public void setInitialFeeDateStr(String initialFeeDateStr) {
        this.initialFeeDateStr = initialFeeDateStr;
    }

    public String getCloseAnAccountDateStr() {
        return closeAnAccountDateStr;
    }

    public void setCloseAnAccountDateStr(String closeAnAccountDateStr) {
        this.closeAnAccountDateStr = closeAnAccountDateStr;
    }

    public Older getOlder() {
        return older;
    }

    public void setOlder(Older older) {
        this.older = older;
    }

    public String getCheckInInitCostStateStr() {
        return checkInInitCostStateStr;
    }

    public void setCheckInInitCostStateStr(String checkInInitCostStateStr) {
        this.checkInInitCostStateStr = checkInInitCostStateStr;
    }

    public List<CheckInInitCost> getCheckInInitCostList() {
        return checkInInitCostList;
    }

    public void setCheckInInitCostList(List<CheckInInitCost> checkInInitCostList) {
        this.checkInInitCostList = checkInInitCostList;
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

    public Long getCheckInInitCostId() {
        return checkInInitCostId;
    }

    public void setCheckInInitCostId(Long checkInInitCostId) {
        this.checkInInitCostId = checkInInitCostId;
    }

    public Long getCheckInInitCostState() {
        return checkInInitCostState;
    }

    public void setCheckInInitCostState(Long checkInInitCostState) {
        this.checkInInitCostState = checkInInitCostState;
    }

    public Date getInitialFeeDate() {
        return initialFeeDate;
    }

    public void setInitialFeeDate(Date initialFeeDate) {
        this.initialFeeDate = initialFeeDate;
    }

    public Date getCloseAnAccountDate() {
        return closeAnAccountDate;
    }

    public void setCloseAnAccountDate(Date closeAnAccountDate) {
        this.closeAnAccountDate = closeAnAccountDate;
    }
}