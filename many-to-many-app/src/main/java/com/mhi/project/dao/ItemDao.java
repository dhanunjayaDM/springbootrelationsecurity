package com.mhi.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mhi.project.model.Item;
@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {

}
