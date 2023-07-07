package com.practice.employee.service;

import java.util.List;

import com.practice.employee.entity.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	
    Employee findById(int theId);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int theId);

}
