package com.idea.cjyl.food.web.domain.pojo;

public class Dishes {
    private Long id;

    private String dishesName;

    private String dishesTaste;

    private String dishesAllergen;

    private String dishesSuitPeople;

    private Byte dishesWeight;

    private String dishesNutritiveValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName == null ? null : dishesName.trim();
    }

    public String getDishesTaste() {
        return dishesTaste;
    }

    public void setDishesTaste(String dishesTaste) {
        this.dishesTaste = dishesTaste == null ? null : dishesTaste.trim();
    }

    public String getDishesAllergen() {
        return dishesAllergen;
    }

    public void setDishesAllergen(String dishesAllergen) {
        this.dishesAllergen = dishesAllergen == null ? null : dishesAllergen.trim();
    }

    public String getDishesSuitPeople() {
        return dishesSuitPeople;
    }

    public void setDishesSuitPeople(String dishesSuitPeople) {
        this.dishesSuitPeople = dishesSuitPeople == null ? null : dishesSuitPeople.trim();
    }

    public Byte getDishesWeight() {
        return dishesWeight;
    }

    public void setDishesWeight(Byte dishesWeight) {
        this.dishesWeight = dishesWeight;
    }

    public String getDishesNutritiveValue() {
        return dishesNutritiveValue;
    }

    public void setDishesNutritiveValue(String dishesNutritiveValue) {
        this.dishesNutritiveValue = dishesNutritiveValue == null ? null : dishesNutritiveValue.trim();
    }
}