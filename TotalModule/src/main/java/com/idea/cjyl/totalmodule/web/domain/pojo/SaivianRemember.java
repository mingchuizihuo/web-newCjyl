package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.Date;

public class SaivianRemember {
    private Long id;

    private Long saivianId;

    private String saivianUserName;

    private String saivianLoginName;

    private String saivianLoginPassword;

    private String tel;

    private String email;

    private String emailPwd;

    private String bankName;

    private Byte bankType;

    private String bankCardNum;

    private String bankEffectiveDate;

    private Date bindDate;

    private Date saivianRenewalDate;

    private Date rebateOpenDate;

    private Date redeemOpenDate;

    private Date arriveCodeDate;

    private Long parent;

    private Byte wage;

    private String totalMoney;

    private String remark;

    private Long serviceUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSaivianId() {
        return saivianId;
    }

    public void setSaivianId(Long saivianId) {
        this.saivianId = saivianId;
    }

    public String getSaivianUserName() {
        return saivianUserName;
    }

    public void setSaivianUserName(String saivianUserName) {
        this.saivianUserName = saivianUserName == null ? null : saivianUserName.trim();
    }

    public String getSaivianLoginName() {
        return saivianLoginName;
    }

    public void setSaivianLoginName(String saivianLoginName) {
        this.saivianLoginName = saivianLoginName == null ? null : saivianLoginName.trim();
    }

    public String getSaivianLoginPassword() {
        return saivianLoginPassword;
    }

    public void setSaivianLoginPassword(String saivianLoginPassword) {
        this.saivianLoginPassword = saivianLoginPassword == null ? null : saivianLoginPassword.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEmailPwd() {
        return emailPwd;
    }

    public void setEmailPwd(String emailPwd) {
        this.emailPwd = emailPwd == null ? null : emailPwd.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Byte getBankType() {
        return bankType;
    }

    public void setBankType(Byte bankType) {
        this.bankType = bankType;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum == null ? null : bankCardNum.trim();
    }

    public String getBankEffectiveDate() {
        return bankEffectiveDate;
    }

    public void setBankEffectiveDate(String bankEffectiveDate) {
        this.bankEffectiveDate = bankEffectiveDate == null ? null : bankEffectiveDate.trim();
    }

    public Date getBindDate() {
        return bindDate;
    }

    public void setBindDate(Date bindDate) {
        this.bindDate = bindDate;
    }

    public Date getSaivianRenewalDate() {
        return saivianRenewalDate;
    }

    public void setSaivianRenewalDate(Date saivianRenewalDate) {
        this.saivianRenewalDate = saivianRenewalDate;
    }

    public Date getRebateOpenDate() {
        return rebateOpenDate;
    }

    public void setRebateOpenDate(Date rebateOpenDate) {
        this.rebateOpenDate = rebateOpenDate;
    }

    public Date getRedeemOpenDate() {
        return redeemOpenDate;
    }

    public void setRedeemOpenDate(Date redeemOpenDate) {
        this.redeemOpenDate = redeemOpenDate;
    }

    public Date getArriveCodeDate() {
        return arriveCodeDate;
    }

    public void setArriveCodeDate(Date arriveCodeDate) {
        this.arriveCodeDate = arriveCodeDate;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Byte getWage() {
        return wage;
    }

    public void setWage(Byte wage) {
        this.wage = wage;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney == null ? null : totalMoney.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getServiceUserId() {
        return serviceUserId;
    }

    public void setServiceUserId(Long serviceUserId) {
        this.serviceUserId = serviceUserId;
    }
}