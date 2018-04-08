package com.scribner.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.scribner.student.dal.entities.Student;

public interface StudentRepo extends CrudRepository<Student, Long> {

}
