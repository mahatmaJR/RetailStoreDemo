package com.demo.retailstoredemo.controller;

import com.demo.retailstoredemo.models.CustomerDetail;
import com.demo.retailstoredemo.models.EmployeeDetail;
import com.demo.retailstoredemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //Endpoints to perform normal CRUD operation on employee details
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public int saveEmployee(EmployeeDetail employeeDetail){
        EmployeeDetail employee = employeeService.saveEmployee(employeeDetail);
        return employee.getId();
    }

    @RequestMapping(value = "/editEmployee/{id}", method = RequestMethod.PUT)
    public EmployeeDetail editEmployee(@PathVariable Integer id, EmployeeDetail employeeDetail){
        employeeService.editEmployee(id, employeeDetail);
        return employeeDetail;
    }

    @RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.DELETE)
    public Boolean deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
        return true;
    }

    @RequestMapping(value = "/getEmployee/{id}")
    public EmployeeDetail getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }

    @RequestMapping(value = "/allEmployee")
    public List<EmployeeDetail> allEmployee(){
        return employeeService.allEmployees();
    }

}
