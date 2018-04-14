package com.williamScribner.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamScribner.location.entities.Location;
import com.williamScribner.location.repos.LocationRepo;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepo repo;

	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return repo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return repo.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub
		repo.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		// TODO Auto-generated method stub
		return repo.findOne(id);
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public LocationRepo getRepo() {
		return repo;
	}

	public void setRepo(LocationRepo repo) {
		this.repo = repo;
	}

}
