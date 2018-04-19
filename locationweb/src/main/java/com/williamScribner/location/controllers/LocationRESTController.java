/*
 * CREATING CRUD METHODS, WHICH WILL BE USING CRUD METHODS FROM THE REPO, TO RETRIEVE DATA IN JSON
 * 
 */

package com.williamScribner.location.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williamScribner.location.entities.Location;
import com.williamScribner.location.repos.LocationRepo;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {
	
	@Autowired
	LocationRepo repo;

	@GetMapping
	public List<Location> getLocations(){
		return repo.findAll();
		
	}
	
	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		return repo.save(location);
	}
	
	@PutMapping
	public Location updateLocation(@RequestBody Location location) {
		return repo.save(location);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		repo.delete(id);
	}
	
	@GetMapping("/{id}")
	public Location getOneLocation(@PathVariable("id") int id) {
		return repo.findOne(id);
		
	}
}
