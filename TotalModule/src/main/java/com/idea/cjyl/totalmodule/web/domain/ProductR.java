package com.idea.cjyl.totalmodule.web.domain;

/**
 * Created by Administrator on 2017/6/18 0018.
 */
public class ProductR {
    private String productName;//产品名称
    private double productNum;//产品数量
    private double productPrice;//产品单价
    private double produtTotal;//产品总价
    private double discount = 0.0;//折扣


    public ProductR() {
    }

    public ProductR(String productName, double productNum, double productPrice, double produtTotal) {
        this.productName = productName;
        this.productNum = productNum;
        this.productPrice = productPrice;
        this.produtTotal = produtTotal;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productNum=" + productNum +
                ", productPrice=" + productPrice +
                ", produtTotal=" + produtTotal +
                ", discount=" + discount +
                '}';
    }


    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductNum() {
        return productNum;
    }

    public void setProductNum(double productNum) {
        this.productNum = productNum;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProdutTotal() {
        return produtTotal;
    }

    public void setProdutTotal() {
        this.produtTotal = this.productPrice*this.productNum;
    }
}
