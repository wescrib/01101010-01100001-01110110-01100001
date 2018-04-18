package com.williamScribner.location.controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.williamScribner.location.entities.Location;
import com.williamScribner.location.repos.LocationRepo;
import com.williamScribner.location.service.LocationService;
import com.williamScribner.location.util.EmailUtil;
import com.williamScribner.location.util.ReportUtil;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;
	
	@Autowired
	LocationRepo repo;
	
	@Autowired
	EmailUtil email;
	
	@Autowired
	ReportUtil reportUtil;
	
	@Autowired
	ServletContext sc;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		System.out.println("THIS IS HERE***************************************************************");
		
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		System.out.println(location + "HEELLLOOOOO");
		Location locationSaved = service.saveLocation(location);
		String msg = "Location saved with id: " + locationSaved.getId();
		modelMap.addAttribute("msg",msg);
		email.sendEmail("jjimenez9994@gmail.com", "TEST", "A LOCATION WAS JUST CREATED\n"+ locationSaved);
		return "redirect:/showCreate";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLoc")
	public String deleteLoc(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = service.getLocationById(id);
		service.deleteLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "redirect:displayLocations";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = service.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
	}
	@PostMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		service.updateLocation(location);
//		List<Location> locations = service.getAllLocations();
//		modelMap.addAttribute("locations", locations);
		
		return "redirect:displayLocations";
	}
	
	//GENERATES DATA VIS
	@RequestMapping("/generateReport")
	public String generateReport() {
		String path = sc.getRealPath("/");
		List<Object[]> data = repo.findTypeAndTypeCount();
		reportUtil.generatePieChart(path, data);
		
		return "report";
	}

}
