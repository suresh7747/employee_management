package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dto.AttandanceDto;
import com.ems.dto.LeaveStatementDto;
import com.ems.entitiy.Attandance;
import com.ems.entitiy.Employee;
import com.ems.entitiy.LeaveStatement;
import com.ems.repository.EmployeeRepository;
import com.ems.repository.LeaveStatementRepo;

@Service
public class LeaveStatementServiceImpl implements LeaveStatementService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private LeaveStatementRepo leaveStatementRepo;

	public LeaveStatementDto createLeaveStatement(LeaveStatementDto leaveStatementDto) {
		LeaveStatement leaveStatement = mapToEntitiy(leaveStatementDto);
		LeaveStatement newLeaveStatement = leaveStatementRepo.save(leaveStatement);
		return null;
	}

	private LeaveStatement mapToEntitiy(LeaveStatementDto leaveStatementDto) {
		LeaveStatement leaveStatement = new LeaveStatement();
		leaveStatement.setYear(leaveStatementDto.getYear());
		leaveStatement.setMonth(leaveStatementDto.getMonth());
		leaveStatement.setOpeningBalanceCL(leaveStatementDto.getOpeningBalanceCL());
		leaveStatement.setOpeningBalanceML(leaveStatementDto.getOpeningBalanceML());
		leaveStatement.setClUsed(leaveStatementDto.getClUsed());
		leaveStatement.setMlUsed(leaveStatementDto.getMlUsed());
		leaveStatement.setClosingBalanceCL(leaveStatementDto.getClosingBalanceCL());
		leaveStatement.setClosingBalanceML(leaveStatementDto.getClosingBalanceML());

		Employee employee = employeeRepository.findById(leaveStatementDto.getEmployee_id())
				.orElseThrow(() -> new RuntimeException("Employee not found")); // Handle the case when employee is not
																				// found
		leaveStatement.setEmployee(employee);
		return leaveStatement;

	}
}
