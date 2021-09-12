package com.demo.retailstoredemo.models;

public class EmployeeDetail {
    Integer id;
    String fName;
    String lName;
    String role;
    String department;

    public EmployeeDetail(Integer id, String fName, String lName, String role, String department) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.role = role;
        this.department = department;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
