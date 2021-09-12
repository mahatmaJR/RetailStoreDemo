package com.demo.retailstoredemo.DAO;

import com.demo.retailstoredemo.models.CustomerDetail;
import org.springframework.data.repository.CrudRepository;



public interface CustomerRepository extends CrudRepository<CustomerDetail, Integer> {
}
