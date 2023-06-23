package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.RuntimeBeanNameReference;
import org.springframework.stereotype.Service;

import com.ems.dto.LeavesDto;
import com.ems.entitiy.Employee;
import com.ems.entitiy.Leaves;
import com.ems.repository.EmployeeRepository;
import com.ems.repository.LeavesRepo;

@Service

public class LeavesServiceImpl implements LeavesService {
	@Autowired
	private LeavesRepo leavesRepo;
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public LeavesDto createLeave(LeavesDto leavesDto) {
		Leaves leaves = mapToEntitiy(leavesDto);
		Leaves newLeaves = leavesRepo.save(leaves);
		return null;
	}
	
	
	private Leaves mapToEntitiy(LeavesDto leavesDto) {
		Leaves leaves = new Leaves();
		
		leaves.setStartDate(leavesDto.getStartDate());
		leaves.setEndDate(leavesDto.getEndDate());
		leaves.setAppliedOn(leavesDto.getAppliedOn());
		leaves.setLeaveType(leavesDto.getLeaveType());
		leaves.setLeaveMsg(leavesDto.getLeaveMsg());
		leaves.setLeaveStartDayPeriod(leavesDto.getLeaveStartDayPeriod());
		leaves.setLeaveEndDayPeriod(leavesDto.getLeaveEndDayPeriod());
		leaves.setApprovedBy(leavesDto.getApprovedBy());
		
		Employee employee = employeeRepository.findById(leavesDto.getEmployee_id())
				.orElseThrow(()-> new RuntimeException("Employee not found"));
		leaves.setEmployee(employee);
		
		return leaves;
	}

}
