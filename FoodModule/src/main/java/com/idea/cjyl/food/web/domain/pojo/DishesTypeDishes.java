package com.idea.cjyl.food.web.domain.pojo;

public class DishesTypeDishes {
    private Long id;

    private Long dishesTypeId;

    private Long dishesId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDishesTypeId() {
        return dishesTypeId;
    }

    public void setDishesTypeId(Long dishesTypeId) {
        this.dishesTypeId = dishesTypeId;
    }

    public Long getDishesId() {
        return dishesId;
    }

    public void setDishesId(Long dishesId) {
        this.dishesId = dishesId;
    }
}