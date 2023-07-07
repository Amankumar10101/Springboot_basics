package com.example.hjp.dao;

import java.util.List;

import com.example.hjp.entity.Student;

public interface StudentDAO {
	
	// create objects
	void save(Student theStudent);
	
	
	// Reading objects
	Student findById(Integer id);
	
	List<Student> findAll();
	
	List<Student> findByLastName(String theLastName);
	
	//update objects
	void update(Student theStudent);
	
	//delete objects
	void delete(Integer id);
	
	int deleteAll();

}
