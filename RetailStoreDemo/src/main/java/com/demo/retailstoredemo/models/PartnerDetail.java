package com.demo.retailstoredemo.models;

public class PartnerDetail {
    Integer id;
    String fName;
    String lName;
    String partnerLevel;
    String company;

    public PartnerDetail(Integer id, String fName, String lName, String partnerLevel, String company) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.partnerLevel = partnerLevel;
        this.company = company;
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

    public String getPartnerLevel() {
        return partnerLevel;
    }

    public void setPartnerLevel(String partnerLevel) {
        this.partnerLevel = partnerLevel;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
