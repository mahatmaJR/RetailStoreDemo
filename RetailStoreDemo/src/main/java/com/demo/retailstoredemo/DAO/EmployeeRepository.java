package com.demo.retailstoredemo.DAO;


import com.demo.retailstoredemo.models.EmployeeDetail;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeDetail, Integer> {
}
