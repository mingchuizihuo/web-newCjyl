package com.idea.cjyl.totalmodule.web.domain.pojo;

public class Shop {
    private Long id;

    private String shopName;

    private String shopCode;

    private Integer shopType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode == null ? null : shopCode.trim();
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }
}