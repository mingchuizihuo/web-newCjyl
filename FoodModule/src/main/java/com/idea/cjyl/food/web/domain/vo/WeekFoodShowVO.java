package com.idea.cjyl.food.web.domain.vo;

import java.util.Date;
import java.util.List;

/**
 * Created by 10238 on 2016/11/9.
 */
public class WeekFoodShowVO {

    private Date weekStartDate;

    private Date weekEndDate;

    private Integer week;

    private List<WeekFoodOneEarlyVO> weekFoodOneEarlyVOs;


    @Override
    public String toString() {
        return "WeekFoodShowVO{" +
                "weekStartDate=" + weekStartDate +
                ", weekEndDate=" + weekEndDate +
                ", week=" + week +
                ", weekFoodOneEarlyVOs=" + weekFoodOneEarlyVOs +
                '}';
    }

    public Date getWeekStartDate() {
        return weekStartDate;
    }

    public void setWeekStartDate(Date weekStartDate) {
        this.weekStartDate = weekStartDate;
    }

    public Date getWeekEndDate() {
        return weekEndDate;
    }

    public void setWeekEndDate(Date weekEndDate) {
        this.weekEndDate = weekEndDate;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public List<WeekFoodOneEarlyVO> getWeekFoodOneEarlyVOs() {
        return weekFoodOneEarlyVOs;
    }

    public void setWeekFoodOneEarlyVOs(List<WeekFoodOneEarlyVO> weekFoodOneEarlyVOs) {
        this.weekFoodOneEarlyVOs = weekFoodOneEarlyVOs;
    }
}
