package com.mhi.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mhi.project.model.Vendor;
@Repository
public interface VendorDAO extends CrudRepository<Vendor, Integer> {

}
