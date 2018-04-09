package com.williamScribner.location.repos;

import org.springframework.data.repository.CrudRepository;

import com.williamScribner.location.entities.Location;

public interface LocationRepo extends CrudRepository<Location, Integer> {

}
