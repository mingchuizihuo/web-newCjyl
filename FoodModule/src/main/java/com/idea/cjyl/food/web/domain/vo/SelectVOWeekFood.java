package com.idea.cjyl.food.web.domain.vo;

import java.util.Date;

/**
 * Created by 10238 on 2016/11/9.
 */
public class SelectVOWeekFood {

    private Date startDate;
    private Date endDate;


    @Override
    public String toString() {
        return "SelectVOWeekFood{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
