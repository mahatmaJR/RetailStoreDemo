package com.demo.retailstoredemo.services;

import com.demo.retailstoredemo.DAO.CustomerRepository;
import com.demo.retailstoredemo.models.CustomerDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepo;

    List<CustomerDetail> listCustomers = new ArrayList<>(

                Arrays.asList(
                    new CustomerDetail(1, "Samuel", "Ngombi", "23-08-2018"),
                    new CustomerDetail(2, "Mark", "Ochieng", "02-12-2020"),
                    new CustomerDetail(3, "Susan", "Chebet", "03-07-2018"),
                    new CustomerDetail(4, "Faith", "Mwikali", "29-01-2019")
            )
    );

    public CustomerDetail saveCustomer(CustomerDetail customer){
        listCustomers.add(customer);
        return customer;
    }

    public CustomerDetail updateCustomerDetail(Integer id,CustomerDetail customer){
        for (int i = 0; i < listCustomers.size(); i++){
            CustomerDetail cust = listCustomers.get(i);
            if(cust.getId().equals(id)){
                listCustomers.set(i, customer);
            }
        }
        return customer;
    }

    public List<CustomerDetail> allCustomers(){
        return listCustomers;
    }

    public CustomerDetail getCustomer(Integer id){
        return (CustomerDetail) listCustomers.stream().filter(customer -> customer.getId().equals(id));
    }


    public void deleteCustomer(Integer id){
        for (int i = 0; i < listCustomers.size(); i++){
            CustomerDetail cust = listCustomers.get(i);
            if(cust.getId().equals(id)){
                listCustomers.remove(cust);
            }
        }
    }
}
