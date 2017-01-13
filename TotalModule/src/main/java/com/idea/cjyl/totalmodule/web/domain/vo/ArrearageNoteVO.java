package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.*;

import java.util.List;

/**
 * Created by xiao on 2016/12/13.
 */
public class ArrearageNoteVO {

    private String olderName;
    private String sex;
    private String floorNum;
    private String bedNum;
    private int money;

    @Override
    public String toString() {
        return "ArrearageNoteVO{" +
                "olderName='" + olderName + '\'' +
                ", sex='" + sex + '\'' +
                ", floorNum='" + floorNum + '\'' +
                ", bedNum='" + bedNum + '\'' +
                ", money=" + money +
                '}';
    }

    public String getOlderName() {
        return olderName;
    }

    public void setOlderName(String olderName) {
        this.olderName = olderName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(String floorNum) {
        this.floorNum = floorNum;
    }

    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
