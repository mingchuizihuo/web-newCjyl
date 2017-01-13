package com.idea.cjyl.totalmodule.web.domain.vo;

/**
 * Created by xiao on 2016/12/14.
 */
public class OlderWeekIntoVO {
    private int month;
    private int girlNum;
    private int manNum;


    @Override
    public String toString() {
        return "OlderWeekIntoVO{" +
                "month=" + month +
                ", girlNum=" + girlNum +
                ", manNum=" + manNum +
                '}';
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getGirlNum() {
        return girlNum;
    }

    public void setGirlNum(int girlNum) {
        this.girlNum = girlNum;
    }

    public int getManNum() {
        return manNum;
    }

    public void setManNum(int manNum) {
        this.manNum = manNum;
    }
}
