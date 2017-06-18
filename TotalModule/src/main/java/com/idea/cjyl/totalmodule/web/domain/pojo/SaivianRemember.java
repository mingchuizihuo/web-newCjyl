package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.Date;

public class SaivianRemember {
    private Long id;

    private Long saivianId;

    private String userName;

    private String loginName;

    private String loginPassword;

    private String tel;

    private String email;

    private String emailPwd;

    private String bankName;

    private Byte bankType;

    private String bankCardNum;

    private String bankEffectiveDate;

    private Date renewalDate;

    private Date redemptionDate;

    private Date clickDate;

    private Long parent;

    private Byte wage;

    private String totalMoney;

    private Long userId;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
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

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Date getRedemptionDate() {
        return redemptionDate;
    }

    public void setRedemptionDate(Date redemptionDate) {
        this.redemptionDate = redemptionDate;
    }

    public Date getClickDate() {
        return clickDate;
    }

    public void setClickDate(Date clickDate) {
        this.clickDate = clickDate;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}