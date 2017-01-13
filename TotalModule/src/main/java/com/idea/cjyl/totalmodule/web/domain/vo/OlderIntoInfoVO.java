package com.idea.cjyl.totalmodule.web.domain.vo;

import java.util.List;

/**
 * Created by xiao on 2016/12/14.
 */
public class OlderIntoInfoVO {
    private List<OlderWeekIntoVO> olderWeekIntoVOS;
    private int beds;
    private int girlNum;
    private int manNum;

    @Override
    public String toString() {
        return "OlderIntoInfoVO{" +
                "olderWeekIntoVOS=" + olderWeekIntoVOS +
                ", beds=" + beds +
                ", girlNum=" + girlNum +
                ", manNum=" + manNum +
                '}';
    }

    public List<OlderWeekIntoVO> getOlderWeekIntoVOS() {
        return olderWeekIntoVOS;
    }

    public void setOlderWeekIntoVOS(List<OlderWeekIntoVO> olderWeekIntoVOS) {
        this.olderWeekIntoVOS = olderWeekIntoVOS;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
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
