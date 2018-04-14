package com.williamScribner.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.williamScribner.vendor.entities.Vendor;
import com.williamScribner.vendor.repo.VendorRepo;

public class VendorService implements VendorServiceInterface {

	@Autowired
	private VendorRepo repo;
	
	@Override
	public Vendor saveVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return repo.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return repo.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		repo.delete(vendor);
		
	}

	@Override
	public Vendor getVendorById(int id) {
		// TODO Auto-generated method stub
		
		return repo.findOne(id);
	}

	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public VendorRepo getRepo() {
		return repo;
	}

	public void setRepo(VendorRepo repo) {
		this.repo = repo;
	}

}
