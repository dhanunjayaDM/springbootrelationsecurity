package com.mhi.project.dao;

import org.neo4j.ogm.cypher.query.Pagination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mhi.project.model.Customers;
@Repository
public interface CustomersDao extends CrudRepository<Customers, Integer>{

}
