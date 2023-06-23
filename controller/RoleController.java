package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.dto.RoleDto;
import com.ems.service.RoleService;

@RestController
public class RoleController {
	@Autowired
	private RoleService roleService;

	@PostMapping(value = "/createRole")
	public ResponseEntity<RoleDto> createRole(@RequestBody RoleDto roleDto) {
		return new ResponseEntity<>(roleService.createRole(roleDto), HttpStatus.CREATED);
	}


}
