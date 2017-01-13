package com.idea.cjyl.food.web.domain.pojo;

public class WeekFoodDishes {
    private Long id;

    private Long weekFoodId;

    private Long dishesId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWeekFoodId() {
        return weekFoodId;
    }

    public void setWeekFoodId(Long weekFoodId) {
        this.weekFoodId = weekFoodId;
    }

    public Long getDishesId() {
        return dishesId;
    }

    public void setDishesId(Long dishesId) {
        this.dishesId = dishesId;
    }
}