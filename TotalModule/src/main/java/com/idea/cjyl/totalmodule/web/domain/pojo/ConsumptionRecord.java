package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.Date;

public class ConsumptionRecord {
    private Long id;

    private Long userSaivianId;

    private Date consumeDate;

    private String consumeMoney;

    private String shopCode;

    private String consumeMonth;

    private String bankName;

    private Byte bankType;

    private String bankCardNum;

    private String bankEffectiveDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserSaivianId() {
        return userSaivianId;
    }

    public void setUserSaivianId(Long userSaivianId) {
        this.userSaivianId = userSaivianId;
    }

    public Date getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(Date consumeDate) {
        this.consumeDate = consumeDate;
    }

    public String getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(String consumeMoney) {
        this.consumeMoney = consumeMoney == null ? null : consumeMoney.trim();
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode == null ? null : shopCode.trim();
    }

    public String getConsumeMonth() {
        return consumeMonth;
    }

    public void setConsumeMonth(String consumeMonth) {
        this.consumeMonth = consumeMonth == null ? null : consumeMonth.trim();
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
}