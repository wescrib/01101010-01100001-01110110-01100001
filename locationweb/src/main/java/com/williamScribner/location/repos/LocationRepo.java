package com.williamScribner.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.williamScribner.location.entities.Location;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer> {
	
	@Query(value="SELECT type, count(type) FROM location group by type", nativeQuery=true)
	public List<Object[]> findTypeAndTypeCount();
}
