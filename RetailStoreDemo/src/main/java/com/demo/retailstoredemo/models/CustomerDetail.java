package com.demo.retailstoredemo.models;

import java.util.Date;

public class CustomerDetail {
    Integer id;
    String fName;
    String lName;
    String firstPurchase;

    public CustomerDetail(Integer id, String fName, String lName, String firstPurchase) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.firstPurchase = firstPurchase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getFirstPurchase() {
        return firstPurchase;
    }

    public void setFirstPurchase(String firstPurchase) {
        this.firstPurchase = firstPurchase;
    }
}
