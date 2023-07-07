package com.practice.employeeRest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.employeeRest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//that's it ... no need to write any code

}
