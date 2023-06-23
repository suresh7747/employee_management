package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.dto.EmployeeDetailsDto;
import com.ems.service.EmployeeDetailService;

@RestController
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailService employeeDetailService;
	
	@PostMapping(value = "/createEmployeeDetail")
	public ResponseEntity<EmployeeDetailsDto> createEmployeeDetail(@RequestBody EmployeeDetailsDto employeeDetailsDto) {
		return new ResponseEntity<>(employeeDetailService.creatEmployeeDetails(employeeDetailsDto), HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/employee-details/{employeeDetailsId}")
	public EmployeeDetailsDto getEmployeeDetailsById(@PathVariable int employeeDetailsId) {
		return employeeDetailService.getEmployeeDetailsById(employeeDetailsId);
	}

}
