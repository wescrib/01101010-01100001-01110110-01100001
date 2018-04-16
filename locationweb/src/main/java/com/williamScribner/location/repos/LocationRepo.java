package com.williamScribner.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.williamScribner.location.entities.Location;

public interface LocationRepo extends JpaRepository<Location, Integer> {
	
	@Query("select type, count(type) from location group by type;")
	public List<Object[]> findTypeAndTypeCount();
}
