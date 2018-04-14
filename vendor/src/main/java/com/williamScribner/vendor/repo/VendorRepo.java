package com.williamScribner.vendor.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamScribner.vendor.entities.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer> {

}
