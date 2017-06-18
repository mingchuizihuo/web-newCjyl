package com.idea.cjyl.totalmodule.web.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by xiaolitong on 2017/6/15.
 */
public class Note {
    private Date consumeDate;//消费时间
    private String consumeNum;//消费流水号
    private Double consumeMoney;//消费总金额
    private List<ProductR> products;//产品列表
    private String bankName;//发卡行
    private String bankNum;//银行卡号
    private String effectDate;//有效期
    private Date swipeDate;//刷卡时间
    private String swipeNum;//刷卡流水号


    @Override
    public String toString() {
        return "Note{" +
                "consumeDate=" + consumeDate +
                ", consumeNum='" + consumeNum + '\'' +
                ", consumeMoney=" + consumeMoney +
                ", products=" + products +
                ", bankName='" + bankName + '\'' +
                ", bankNum='" + bankNum + '\'' +
                ", effectDate='" + effectDate + '\'' +
                ", swipeDate=" + swipeDate +
                ", swipeNum='" + swipeNum + '\'' +
                '}';
    }

    public Date getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(Date consumeDate) {
        this.consumeDate = consumeDate;
    }

    public String getConsumeNum() {
        return consumeNum;
    }

    public void setConsumeNum(String consumeNum) {
        this.consumeNum = consumeNum;
    }

    public Double getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(Double consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public List<ProductR> getProducts() {
        return products;
    }

    public void setProducts(List<ProductR> products) {
        this.products = products;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public String getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(String effectDate) {
        this.effectDate = effectDate;
    }

    public Date getSwipeDate() {
        return swipeDate;
    }

    public void setSwipeDate(Date swipeDate) {
        this.swipeDate = swipeDate;
    }

    public String getSwipeNum() {
        return swipeNum;
    }

    public void setSwipeNum(String swipeNum) {
        this.swipeNum = swipeNum;
    }
}
