package com.idea.cjyl.food.web.domain.pojo;

import java.util.Date;

public class WeekFood {
    private Long id;

    private Byte weekDate;

    private Byte oneEarly;

    private String dishesList;

    private Date foodDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getWeekDate() {
        return weekDate;
    }

    public void setWeekDate(Byte weekDate) {
        this.weekDate = weekDate;
    }

    public Byte getOneEarly() {
        return oneEarly;
    }

    public void setOneEarly(Byte oneEarly) {
        this.oneEarly = oneEarly;
    }

    public String getDishesList() {
        return dishesList;
    }

    public void setDishesList(String dishesList) {
        this.dishesList = dishesList == null ? null : dishesList.trim();
    }

    public Date getFoodDate() {
        return foodDate;
    }

    public void setFoodDate(Date foodDate) {
        this.foodDate = foodDate;
    }
}