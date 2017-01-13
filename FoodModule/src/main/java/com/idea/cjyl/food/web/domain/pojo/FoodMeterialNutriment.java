package com.idea.cjyl.food.web.domain.pojo;

public class FoodMeterialNutriment {
    private Long id;

    private Long meterialId;

    private Long nutrimentId;

    private Byte nutrimentValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMeterialId() {
        return meterialId;
    }

    public void setMeterialId(Long meterialId) {
        this.meterialId = meterialId;
    }

    public Long getNutrimentId() {
        return nutrimentId;
    }

    public void setNutrimentId(Long nutrimentId) {
        this.nutrimentId = nutrimentId;
    }

    public Byte getNutrimentValue() {
        return nutrimentValue;
    }

    public void setNutrimentValue(Byte nutrimentValue) {
        this.nutrimentValue = nutrimentValue;
    }
}