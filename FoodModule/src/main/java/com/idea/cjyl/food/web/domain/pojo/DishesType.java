package com.idea.cjyl.food.web.domain.pojo;

public class DishesType {
    private Long id;

    private String dishesTypeName;

    private Byte dishesTypeLevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDishesTypeName() {
        return dishesTypeName;
    }

    public void setDishesTypeName(String dishesTypeName) {
        this.dishesTypeName = dishesTypeName == null ? null : dishesTypeName.trim();
    }

    public Byte getDishesTypeLevel() {
        return dishesTypeLevel;
    }

    public void setDishesTypeLevel(Byte dishesTypeLevel) {
        this.dishesTypeLevel = dishesTypeLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}