package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entitiy.EmployeeDetails;

public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetails, Integer>{

}
