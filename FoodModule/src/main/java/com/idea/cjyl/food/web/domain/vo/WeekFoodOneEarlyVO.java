package com.idea.cjyl.food.web.domain.vo;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by 10238 on 2016/11/9.
 */
public class WeekFoodOneEarlyVO {

    private Map<String,Object> morningDishes;
    private Map<String,Object> noonDishes;
    private Map<String,Object> nightDishes;
    private Date foodDate;

    @Override
    public String toString() {
        return "WeekFoodOneEarlyVO{" +
                "morningDishes=" + morningDishes +
                ", noonDishes=" + noonDishes +
                ", nightDishes=" + nightDishes +
                ", foodDate=" + foodDate +
                '}';
    }

    public Map<String, Object> getMorningDishes() {
        return morningDishes;
    }

    public void setMorningDishes(Map<String, Object> morningDishes) {
        this.morningDishes = morningDishes;
    }

    public Map<String, Object> getNoonDishes() {
        return noonDishes;
    }

    public void setNoonDishes(Map<String, Object> noonDishes) {
        this.noonDishes = noonDishes;
    }

    public Map<String, Object> getNightDishes() {
        return nightDishes;
    }

    public void setNightDishes(Map<String, Object> nightDishes) {
        this.nightDishes = nightDishes;
    }

    public Date getFoodDate() {
        return foodDate;
    }

    public void setFoodDate(Date foodDate) {
        this.foodDate = foodDate;
    }
}
