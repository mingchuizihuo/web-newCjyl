package com.idea.cjyl.food.web.domain.pojo;

public class FoodMeterial {
    private Long id;

    private String meterialTypeName;

    private Byte meterialTypeLevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeterialTypeName() {
        return meterialTypeName;
    }

    public void setMeterialTypeName(String meterialTypeName) {
        this.meterialTypeName = meterialTypeName == null ? null : meterialTypeName.trim();
    }

    public Byte getMeterialTypeLevel() {
        return meterialTypeLevel;
    }

    public void setMeterialTypeLevel(Byte meterialTypeLevel) {
        this.meterialTypeLevel = meterialTypeLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}