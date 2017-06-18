package com.idea.cjyl.totalmodule.web.domain;

/**
 * Created by Administrator on 2017/6/18 0018.
 */
public class ProductR {
    private String productName;//产品名称
    private int productNum;//产品数量
    private double productPrice;//产品单价
    private double produtTotal;//产品总价
    private double discount;//折扣


    public ProductR(String productName, int productNum, double productPrice, double produtTotal, double discount) {
        this.productName = productName;
        this.productNum = productNum;
        this.productPrice = productPrice;
        this.produtTotal = produtTotal;
        this.discount = discount;
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

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
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

    public void setProdutTotal(double produtTotal) {
        this.produtTotal = produtTotal;
    }
}
