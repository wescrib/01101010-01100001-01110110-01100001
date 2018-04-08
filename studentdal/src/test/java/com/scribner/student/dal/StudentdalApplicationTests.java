package com.scribner.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.scribner.student.dal.entities.Student;
import com.scribner.student.dal.repos.StudentRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepo studentRepo;

	@Test
	public void testCreateStudent() {
		
		Student student = new Student();
		student.setName("John");
		student.setCourse("Java Web Services");
		student.setFees(30d);
		
		studentRepo.save(student);
		
	}
	@Test
	public void testFindStudentById(){
		Student student = studentRepo.findOne(1l);
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Student student = studentRepo.findOne(1l);
		student.setFees(40d);
		
		studentRepo.save(student);
	}
	
	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(1L);
		studentRepo.delete(1L);
	}

}
