package com.idea.cjyl.totalmodule.web.domain.vo;

/**
 * Created by xiao on 2016/12/15.
 */
public class MonthChargeCharVO {

    private String  name;
    private int value;
    private String color;

    @Override
    public String toString() {
        return "MonthChargeCharVO{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
