package com.williamScribner.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.williamScribner.vendor.service.*;
import com.williamScribner.vendor.entities.*;

@Controller
public class VendorControl {
	
	public static String msg;

	@Autowired
	VendorServiceInterface service;
	
	@RequestMapping("/")
	public String createVendorForm(ModelMap modelMap) {
		modelMap.addAttribute("msg", msg);
		return "createVendor";
	}
	@RequestMapping("/createVendor")
	public String createVendor(@ModelAttribute("vendor") Vendor v, ModelMap modelMap) {
		Vendor venSave = service.saveVendor(v);
		msg = "Vendor added with ID: " + venSave.getId();
		modelMap.addAttribute("msg", msg);
		return "redirect:/";
	}
	@RequestMapping("/displayAll")
	public String displayAllVendor(ModelMap modelMap) {
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	@RequestMapping("/edit")
	public String editVendor(@RequestParam("id") int id, ModelMap modelMap) {
		Vendor vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "edit";
	}
	
	@RequestMapping("/editVendor")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		service.updateVendor(vendor);
		return "redirect:/displayAll";
	}
	
	@RequestMapping("/delete")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		service.deleteVendor(service.getVendorById(id));
		return "redirect:displayAll";
	}
	
}
