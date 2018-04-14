package com.williamScribner.vendor.service;

import java.util.List;

import com.williamScribner.vendor.entities.Vendor;

public interface VendorServiceInterface {

	Vendor saveVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	void deleteVendor(Vendor vendor);
	Vendor getVendorById(int id);
	List<Vendor> getAllVendors();
}
