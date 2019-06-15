package com.mhi.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mhi.project.model.Customers;

@Service
public class CustomersService {
	@Autowired
	private com.mhi.project.dao.CustomersDao CustomersDao;

	public Iterable<Customers> getCustomers() {
		Iterable<Customers> customers=CustomersDao.findAll();
		return customers;
	}

	public Customers save(Customers customers) {
		
		Customers customers12=CustomersDao.save(customers);
		return customers12;
	}

}
