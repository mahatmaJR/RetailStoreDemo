package com.demo.retailstoredemo.DAO;

import com.demo.retailstoredemo.models.ProductDetail;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductDetail, Integer> {
}
