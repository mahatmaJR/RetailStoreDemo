package com.demo.retailstoredemo.DAO;

import com.demo.retailstoredemo.models.ShoppingDetail;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingRepository extends CrudRepository<ShoppingDetail, Integer> {
}
