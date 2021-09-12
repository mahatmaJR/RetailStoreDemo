package com.demo.retailstoredemo.models;

public class ProductDetail {
    Integer id;
    String pName;
    double price;
    ProductType productType;
    ShoppingDetail shopping;

    public ProductDetail(Integer id, String pName, double price, ProductType productType) {
        this.id = id;
        this.pName = pName;
        this.price = price;
        this.productType = productType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ShoppingDetail getShopping() {
        return shopping;
    }

    public void setShopping(ShoppingDetail shopping) {
        this.shopping = shopping;
    }
}
