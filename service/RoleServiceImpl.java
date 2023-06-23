package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dto.RoleDto;
import com.ems.entitiy.Role;
import com.ems.repository.RoleRepository;

@Service
public class RoleServiceImpl  implements RoleService{
	@Autowired
	private RoleRepository roleRepository;
	
	public RoleDto createRole(RoleDto roleDto) {
		// convert dto to entitiy
				Role role = mapToEntitiy(roleDto);
				Role newRole = roleRepository.save(role);
				
				// convert entitiy to dto
				RoleDto roleResponse = mapToDto(newRole);
				return roleResponse;
	}
	
	private Role mapToEntitiy(RoleDto roleDto) {
		Role role =new Role();
		role.setRoleName(roleDto.getRoleName());
		return role;
	}

	private RoleDto mapToDto(Role role) {
		RoleDto roleDto = new RoleDto();
		roleDto.setRoleName(role.getRoleName());
		return roleDto;
	}
	
}
