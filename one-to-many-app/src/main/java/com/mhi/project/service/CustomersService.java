package com.mhi.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhi.project.dao.CustomersDAO;

@Service
public class CustomersService {
	@Autowired
	private CustomersDAO customersDAO;
	
	

}
