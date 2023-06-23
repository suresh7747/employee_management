package com.ems.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dto.EmployeeDto;
import com.ems.dto.RoleDto;
import com.ems.entitiy.Employee;
import com.ems.entitiy.Role;
import com.ems.entitiy.RoleName;
import com.ems.repository.EmployeeRepository;
import com.ems.repository.RoleRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private RoleRepository roleRepository;

	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		// convert dto to entitiy
		Employee employee = mapToEntitiy(employeeDto);
		Employee newEmployee = employeeRepository.save(employee);
		// convert entitiy to dto
		EmployeeDto employeeResponse = mapToDto(newEmployee);
		return employeeResponse;
	}

	private Employee mapToEntitiy(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		Role role = new Role();
		RoleDto roleDto = new RoleDto();

		employee.setName(employeeDto.getName());
		employee.setEmail(employeeDto.getEmail());
		employee.setPassword(employeeDto.getPassword());
		employee.setActivity(employeeDto.getActivity());

//		role.setRole_id(employeeDto.getRole_id());
//		
//	
//		if (role.getRoleName().equals("Admin")) {
//			employee.setManager(null);
//
//		} else {
//			Employee manager = new Employee();
//			manager.setEmployee_id(employeeDto.getManager_id());
//			employee.setManager(manager);
//
//		}
//		

		role.setRole_id(employeeDto.getRole_id());
		Optional<Role> optionalRole = roleRepository.findById(employeeDto.getRole_id());
		if (optionalRole.isPresent()) {
			role = optionalRole.get();
		}

		employee.setRole(role);

		if (role.getRoleName() == RoleName.Admin) {
			employee.setManager(null);
		} 
		else

		{
			Employee manager = new Employee();
			manager.setEmployee_id(employeeDto.getManager_id());
			employee.setManager(manager);
		}

		if (role.getRoleName() == RoleName.Manager) {
			Employee manager = new Employee();
			manager.setEmployee_id(employeeDto.getManager_id());

			Employee referenceById = employeeRepository.getReferenceById(employeeDto.getManager_id());
			int adminId = referenceById.getEmployee_id();

			if (manager.getEmployee_id() == adminId) {
				manager.setEmployee_id(adminId);
				employee.setManager(manager);
			}

		} else {
			employee.setManager(null);
		}

		return employee;

	}

//	employee.setManager(employeeRepository.getReferenceById(employeeDto.getmanagerId));
//
//	// Set subordinates if available
//	if (employeeDto.getSubordinateIds() != null) {
//		employeeDto.getSubordinateIds().forEach(subordinateId -> {
//			Employee subordinate = userRepository.getReferenceById(subordinateId);
//			employee.getSubordinates().add(subordinate);
//		});
//	}

	private EmployeeDto mapToDto(Employee employee) {
		EmployeeDto employeeDto = new EmployeeDto();
		RoleDto roleDto = new RoleDto();

		employeeDto.setName(employee.getName());
		employeeDto.setEmail(employee.getEmail());
		employeeDto.setPassword(employee.getPassword());
		employeeDto.setActivity(employee.getActivity());
//		employeeDto.setManager(employee.getManager());
//		
//		roleDto.setRole_id(employee.getRole().getRole_id());
//	    employeeDto.setRole_id(roleDto);
		return employeeDto;
	}

	
}
