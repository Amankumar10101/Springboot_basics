package com.practice.employee.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//that's it ... no need to write any code

}
