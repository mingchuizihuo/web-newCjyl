package com.idea.cjyl.totalmodule.web.domain;

/**
 * Created by Administrator on 2017/6/18 0018.
 */
public class ProductR {
    private String productName;//产品名称
    private Double productNum;//产品数量
    private Double productPrice;//产品单价
    private Double produtTotal;//产品总价
    private Double discount;//

    public ProductR(String productName, Double productNum, Double productPrice, Double produtTotal, Double discount) {
        this.productName = productName;
        this.productNum = productNum;
        this.productPrice = productPrice;
        this.produtTotal = produtTotal;
        this.discount = discount;
    }

    public ProductR() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductNum() {
        return productNum;
    }

    public void setProductNum(Double productNum) {
        this.productNum = productNum;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Double getProdutTotal() {
        return produtTotal;
    }

    public void setProdutTotal(Double produtTotal) {
        this.produtTotal = produtTotal;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
