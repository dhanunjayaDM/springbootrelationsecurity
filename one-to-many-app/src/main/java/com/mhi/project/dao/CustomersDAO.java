package com.mhi.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mhi.project.model.Customers;

@Repository
public interface CustomersDAO extends CrudRepository<Customers, Integer> {

}
