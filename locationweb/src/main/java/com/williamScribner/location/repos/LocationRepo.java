package com.williamScribner.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.williamScribner.location.entities.Location;

public interface LocationRepo extends JpaRepository<Location, Integer> {

}
