package com.idea.cjyl.totalmodule.web.domain.pojo;

public class Product {
    private Long id;

    private String productName;

    private String productPrice;

    private Integer productPriceType;

    private Integer productType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice == null ? null : productPrice.trim();
    }

    public Integer getProductPriceType() {
        return productPriceType;
    }

    public void setProductPriceType(Integer productPriceType) {
        this.productPriceType = productPriceType;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productPriceType=" + productPriceType +
                ", productType=" + productType +
                '}';
    }
}