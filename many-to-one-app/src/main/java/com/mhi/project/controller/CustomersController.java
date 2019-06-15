package com.mhi.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mhi.project.dao.VendorDao;
import com.mhi.project.model.Customers;
import com.mhi.project.model.Vendor;
import com.mhi.project.service.CustomersService;

@RestController
public class CustomersController 
{
	@Autowired
	private CustomersService customersService;
	
	@Autowired
	private VendorDao vendorDao;
	
	@PostMapping("/create")
	public Customers Saverecord(@RequestBody Customers customers){
		System.out.println("con begin");
		int id=customers.getParent().getVendorId();
		Vendor vendor=vendorDao.findOne(id);
		customers.setParent(vendor);
		Customers customers12=customersService.save(customers);
		System.out.println("con end");
		return customers12;	
	}
	
	@GetMapping(value="/getCustomers")
	public Iterable<Customers> getCustomers(){
		Iterable<Customers> customers=customersService.getCustomers();
		return  customers;
	}

}
