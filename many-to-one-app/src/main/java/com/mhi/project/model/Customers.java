package com.mhi.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customers {
	
	@Id
	@Column(name = "custid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;

	@Column(name = "custName", length=10)
	private String customerName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="venid",nullable = false)
	private Vendor parent;
//	private Integer vendorId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

//	public int getVendorId() {
//		return vendorId;
//	}
//
//	public void setVendorId(int vendorId) {
//		this.vendorId = vendorId;
//	}

	public Vendor getParent() {
		return parent;
	}

	public void setParent(Vendor parent) {
		this.parent = parent;
	}

}
