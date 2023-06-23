package com.ems.service;

import com.ems.dto.EmployeeDetailsDto;

public interface EmployeeDetailService {
	EmployeeDetailsDto creatEmployeeDetails(EmployeeDetailsDto employeeDetailsDto);

	EmployeeDetailsDto getEmployeeDetailsById(int employeeDetailsId);
}
