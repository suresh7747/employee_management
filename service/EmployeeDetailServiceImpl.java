package com.ems.service;

import java.util.Optional;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dto.EmployeeDetailsDto;
import com.ems.dto.EmployeeDto;
import com.ems.entitiy.Employee;
import com.ems.entitiy.EmployeeDetails;
import com.ems.entitiy.Technology;
import com.ems.repository.EmployeeDetailsRepo;
import com.ems.repository.EmployeeRepository;
import com.ems.repository.TechnologyRepo;

@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService {
	@Autowired
	private EmployeeDetailsRepo employeeDetailsRepo;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private TechnologyRepo technologyRepo;

	public EmployeeDetailsDto creatEmployeeDetails(EmployeeDetailsDto employeeDetailsDto) {
		// convert dto to entitiy
		EmployeeDetails employeeDetails = mapToEntitiy(employeeDetailsDto);
		EmployeeDetails newEmployeeDetails = employeeDetailsRepo.save(employeeDetails);
		return null;
	}

	private EmployeeDetails mapToEntitiy(EmployeeDetailsDto employeeDetailsDto) {
		EmployeeDetails employeeDetails = new EmployeeDetails();

		employeeDetails.setFatherName(employeeDetailsDto.getFatherName());
		employeeDetails.setMotherName(employeeDetailsDto.getMotherName());
		employeeDetails.setDateOfBirth(employeeDetailsDto.getDateOfBirth());
		employeeDetails.setQualification(employeeDetailsDto.getQualification());
		employeeDetails.setExperinceInYear(employeeDetailsDto.getExperinceInYear());
		employeeDetails.setPanNo(employeeDetailsDto.getPanNo());
		employeeDetails.setMobileNo(employeeDetailsDto.getMobileNo());
		employeeDetails.setAddress(employeeDetailsDto.getAddress());

		Employee employee = employeeRepository.findById(employeeDetailsDto.getEmployee_id())
				.orElseThrow(() -> new RuntimeException("Employee not found")); // Handle the case when employee is not
																				// found
		employeeDetails.setEmployee(employee);

		Technology technology = technologyRepo.findById(employeeDetailsDto.getTechnology_id())
				.orElseThrow(() -> new RuntimeException("Technology not found"));

		employeeDetails.setTechnology(technology);

		return employeeDetails;

	}

	public EmployeeDetailsDto getEmployeeDetailsById(int employeeDetailsId) {
		Optional<EmployeeDetails> employeeDetailsOptional = employeeDetailsRepo.findById(employeeDetailsId);
		if (employeeDetailsOptional.isPresent()) {
			EmployeeDetails employeeDetails = employeeDetailsOptional.get();
			EmployeeDetailsDto employeeDetailsDto = mapToDto(employeeDetails);
			return employeeDetailsDto;
		}
		return null;
	}

	private EmployeeDetailsDto mapToDto(EmployeeDetails employeeDetails) {
		EmployeeDetailsDto employeeDetailsDto = new EmployeeDetailsDto();

		employeeDetailsDto.setFatherName(employeeDetails.getFatherName());
		employeeDetailsDto.setMotherName(employeeDetails.getMotherName());
		employeeDetailsDto.setDateOfBirth(employeeDetails.getDateOfBirth());
		employeeDetailsDto.setGender(employeeDetails.getGender());
		employeeDetailsDto.setQualification(employeeDetails.getQualification());
		employeeDetailsDto.setExperinceInYear(employeeDetails.getExperinceInYear());
		employeeDetailsDto.setPanNo(employeeDetails.getPanNo());
		employeeDetailsDto.setMobileNo(employeeDetails.getMobileNo());
		employeeDetailsDto.setAddress(employeeDetails.getAddress());
		employeeDetailsDto.setEmployee_id(employeeDetails.getEmployee().getEmployee_id());
		employeeDetailsDto.setEmail(employeeDetails.getEmployee().getEmail());
		employeeDetailsDto.setName(employeeDetails.getEmployee().getName());
		employeeDetailsDto.setActivity(employeeDetails.getEmployee().getActivity());
		employeeDetailsDto.setRole_id(employeeDetails.getEmployee().getRole().getRole_id());
		employeeDetailsDto.setRoleName(employeeDetails.getEmployee().getRole().getRoleName());
		employeeDetailsDto.setTechnology_id(employeeDetails.getTechnology().getTechnologyId());
		employeeDetailsDto.setTechnologyName(employeeDetails.getTechnology().getTechnologyName());
		return employeeDetailsDto;
	}
	
}
