package com.mhi.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mhi.project.dao.CategoriesDao;
import com.mhi.project.dao.ItemDao;

@RestController
public class CategoriesController 
{
	@Autowired
	private CategoriesDao categoriesDao;
	
	@Autowired
	private ItemDao itemDao;
	
	
	
	

}
