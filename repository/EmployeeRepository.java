package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entitiy.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
