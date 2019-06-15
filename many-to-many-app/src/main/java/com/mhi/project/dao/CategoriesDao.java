package com.mhi.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mhi.project.model.Categories;
@Repository
public interface CategoriesDao extends CrudRepository<Categories, Integer> {

}
