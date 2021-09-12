package com.demo.retailstoredemo.models;

import java.util.List;

public class ShoppingDetail {

    Integer id;
    String shopperName;
    String shopperType;
    List<ProductDetail> selectedItems;
    Double totalBill;

    public ShoppingDetail(){}

    public ShoppingDetail(Integer id, String shopperName, String shopperType, List<ProductDetail> selectedItems, Double totalBill) {
        this.id = id;
        this.shopperName = shopperName;
        this.shopperType = shopperType;
        this.selectedItems = selectedItems;
        this.totalBill = totalBill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopperName() {
        return shopperName;
    }

    public void setShopperName(String shopperName) {
        this.shopperName = shopperName;
    }

    public String getShopperType() {
        return shopperType;
    }

    public void setShopperType(String shopperType) {
        this.shopperType = shopperType;
    }

    public List<ProductDetail> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(List<ProductDetail> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public Double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }

    public void addProductToShopping(ProductDetail product){
        product.setShopping(this);
        selectedItems.add(product);
        this.setSelectedItems(selectedItems);
    }

    public void removeProductToShopping(ProductDetail product){
        product.setShopping(null);
        selectedItems.remove(product);
        this.setSelectedItems(selectedItems);

    }

}
