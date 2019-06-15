package com.mhi.project.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhi.project.dao.CustomersDAO;
import com.mhi.project.dao.VendorDAO;
import com.mhi.project.model.Customers;
import com.mhi.project.model.Vendor;

@Service
public class VendorService {
	@Autowired
	private VendorDAO vendorDAO;
	@Autowired
	private CustomersDAO customersDAO;
	
	public Vendor save(Vendor vendor){
		System.out.println("service begin");
		Set<Customers> customers= vendor.getChildren();
		Vendor vendor1=	vendorDAO.save(vendor);
		return vendor1;
	}

	public Iterable<Vendor> getVenders() {
		Iterable<Vendor> venders=vendorDAO.findAll();
		return venders;
	}

	public void deleteVender(Integer vendorId) {
		vendorDAO.delete(vendorId);
	}

	public Vendor updateVender(Integer vendorId, Vendor vender) {
		Vendor vender1=vendorDAO.findOne(vendorId);
		vender.getChildren();
		vender1.setChildren(vender.getChildren());
		Vendor vender2=vendorDAO.save(vender1);
		return vender2;
	}

}
