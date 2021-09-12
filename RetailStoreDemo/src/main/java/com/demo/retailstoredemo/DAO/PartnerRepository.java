package com.demo.retailstoredemo.DAO;

import com.demo.retailstoredemo.models.PartnerDetail;
import org.springframework.data.repository.CrudRepository;

public interface PartnerRepository extends CrudRepository<PartnerDetail, Integer> {
}
