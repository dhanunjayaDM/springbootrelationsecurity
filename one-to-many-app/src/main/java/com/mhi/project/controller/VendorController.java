package com.mhi.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.mhi.project.model.Vendor;
import com.mhi.project.service.VendorService;

@RestController
public class VendorController {
	@Autowired
	private VendorService vendorService;
	
	@PostMapping("/create")
	public Vendor Saverecord(@RequestBody Vendor vender){
		System.out.println("con begin");
		Vendor vendor12=vendorService.save(vender);
		System.out.println("con end");
		return vendor12;	
	}
	
	@GetMapping(value="/getVenders")
	public Iterable<Vendor> getVenders(){
		Iterable<Vendor> venders=vendorService.getVenders();
		return  venders;
	}
	
	@DeleteMapping(value="/vender/{vendorId}")
	public void deleteTicket(@PathVariable("vendorId")Integer vendorId){
		vendorService.deleteVender(vendorId);
	}
	
	@PutMapping(value="/vender/{vendorId}")
	public Vendor updateTicket(@PathVariable("vendorId")Integer vendorId,@RequestBody Vendor vender){
		return vendorService.updateVender(vendorId,vender);
	}

}
