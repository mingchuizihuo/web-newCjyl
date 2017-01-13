package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.Older;
import com.idea.cjyl.totalmodule.web.domain.pojo.ServiceCharge;

import java.util.Date;

public class OlderCostVO {
    private Long id;

    private Long organizationLoginId;

    private Long olderId;

    private Long serviceChargeId;

    private String serviceChargeContext;

    private Long serviceChargeState;

    private Date serviceChargeDate;

    private Date closeAnAccountDate;
    private Older older;
    private ServiceCharge serviceCharge;


    @Override
    public String toString() {
        return "OlderCostVO{" +
                "id=" + id +
                ", organizationLoginId=" + organizationLoginId +
                ", olderId=" + olderId +
                ", serviceChargeId=" + serviceChargeId +
                ", serviceChargeContext='" + serviceChargeContext + '\'' +
                ", serviceChargeState=" + serviceChargeState +
                ", serviceChargeDate=" + serviceChargeDate +
                ", closeAnAccountDate=" + closeAnAccountDate +
                ", older=" + older +
                ", serviceCharge=" + serviceCharge +
                '}';
    }

    public Older getOlder() {
        return older;
    }

    public void setOlder(Older older) {
        this.older = older;
    }

    public ServiceCharge getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(ServiceCharge serviceCharge) {
        this.serviceCharge = serviceCharge;
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

    public Long getServiceChargeId() {
        return serviceChargeId;
    }

    public void setServiceChargeId(Long serviceChargeId) {
        this.serviceChargeId = serviceChargeId;
    }

    public String getServiceChargeContext() {
        return serviceChargeContext;
    }

    public void setServiceChargeContext(String serviceChargeContext) {
        this.serviceChargeContext = serviceChargeContext == null ? null : serviceChargeContext.trim();
    }

    public Long getServiceChargeState() {
        return serviceChargeState;
    }

    public void setServiceChargeState(Long serviceChargeState) {
        this.serviceChargeState = serviceChargeState;
    }

    public Date getServiceChargeDate() {
        return serviceChargeDate;
    }

    public void setServiceChargeDate(Date serviceChargeDate) {
        this.serviceChargeDate = serviceChargeDate;
    }

    public Date getCloseAnAccountDate() {
        return closeAnAccountDate;
    }

    public void setCloseAnAccountDate(Date closeAnAccountDate) {
        this.closeAnAccountDate = closeAnAccountDate;
    }
}