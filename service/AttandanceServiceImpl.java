package com.ems.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dto.AttandanceDto;
import com.ems.dto.EmployeeDetailsDto;
import com.ems.entitiy.Attandance;
import com.ems.entitiy.AttandanceSource;
import com.ems.entitiy.Employee;
import com.ems.entitiy.EmployeeDetails;
import com.ems.repository.AttandanceRepo;
import com.ems.repository.EmployeeRepository;

@Service
public class AttandanceServiceImpl implements AttandanceService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private AttandanceRepo attandanceRepo;

	public AttandanceDto createAttandance(AttandanceDto attandanceDto) {
		Attandance attandance = mapToEntitiy(attandanceDto);
		Attandance newAttandance = attandanceRepo.save(attandance);
		return null;
	}

	private Attandance mapToEntitiy(AttandanceDto attandanceDto) {
		Attandance attandance = new Attandance();

		attandance.setDate(attandanceDto.getDate());
		attandance.setIntime(attandanceDto.getIntime());
		attandance.setEntryType(attandanceDto.getEntryType());
		attandance.setStatus(attandanceDto.getStatus());
		attandance.setAttandanceSource(attandanceDto.getAttandanceSource());
		attandance.setApprovedBy(attandanceDto.getApprovedBy());

		Employee employee = employeeRepository.findById(attandanceDto.getEmployee_id())
				.orElseThrow(() -> new RuntimeException("Employee not found")); // Handle the case when employee is not
																				// found
		attandance.setEmployee(employee);

		return attandance;

	}

	public AttandanceDto getAttandanceById(int employee_id) {
		Optional<Attandance> attandanceOptional = attandanceRepo.findById(employee_id);
		if (attandanceOptional.isPresent()) {
			Attandance attandance = attandanceOptional.get();
			AttandanceDto attandanceDto = mapToDto(attandance);
			return attandanceDto;
		}
		return null;
	}

	private AttandanceDto mapToDto(Attandance attandance) {
		AttandanceDto attandanceDto = new AttandanceDto();

		attandanceDto.setDate(attandance.getDate());
		attandanceDto.setIntime(attandance.getIntime());
		attandanceDto.setEntryType(attandance.getEntryType());
		attandanceDto.setStatus(attandance.getStatus());
		attandanceDto.setAttandanceSource(attandance.getAttandanceSource());
		attandanceDto.setApprovedBy(attandance.getApprovedBy());
		attandanceDto.setEmployee_id(attandance.getEmployee().getEmployee_id());
		return attandanceDto;

	}

}
