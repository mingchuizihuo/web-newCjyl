package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.Date;

public class ConsumptionRecord {
    private Long id;

    private Long userSaivianId;

    private Date consumeDate;

    private String consumeMoney;

    private String shopCode;

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
}