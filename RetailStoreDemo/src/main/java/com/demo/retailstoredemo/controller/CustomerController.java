package com.demo.retailstoredemo.controller;

import com.demo.retailstoredemo.models.CustomerDetail;
import com.demo.retailstoredemo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    //Endpoints to perform normal CRUD operation on customer details
    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public int saveCustomer(CustomerDetail customerDetail){
        CustomerDetail customer = customerService.saveCustomer(customerDetail);
        return customer.getId();
    }

    @RequestMapping(value = "/editCustomer/{id}", method = RequestMethod.PUT)
    public CustomerDetail editCustomer(@PathVariable Integer id,  @RequestBody CustomerDetail customer){
        customerService.updateCustomerDetail(id, customer);
        return customer;
    }

    @RequestMapping(value = "/deleteCustomer/{id}", method = RequestMethod.DELETE)
    public Boolean deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomer(id);
        return true;
    }

    @RequestMapping(value = "/customer/{id}")
    public CustomerDetail getCustomer(@PathVariable Integer id){
        return customerService.getCustomer(id);
    }

    @RequestMapping("/allCustomer")
    public List<CustomerDetail> allCustomer(){
        List<CustomerDetail> allCustomers = customerService.allCustomers();
        return allCustomers;
    }
}
