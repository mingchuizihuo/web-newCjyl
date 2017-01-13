package com.idea.cjyl.food.web.domain.pojo;

public class Nutriment {
    private Long id;

    private String nutrimentName;

    private Byte nutrimentLevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNutrimentName() {
        return nutrimentName;
    }

    public void setNutrimentName(String nutrimentName) {
        this.nutrimentName = nutrimentName == null ? null : nutrimentName.trim();
    }

    public Byte getNutrimentLevel() {
        return nutrimentLevel;
    }

    public void setNutrimentLevel(Byte nutrimentLevel) {
        this.nutrimentLevel = nutrimentLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}