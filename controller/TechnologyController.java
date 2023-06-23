package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.dto.RoleDto;
import com.ems.dto.TechnologyDto;
import com.ems.service.TechnologyService;

@RestController
public class TechnologyController {
	
	@Autowired
	private TechnologyService technologyService;
	
	@PostMapping(value = "/createTechnology")
	public ResponseEntity<TechnologyDto> createTechnology(@RequestBody TechnologyDto technologyDto) {
		return new ResponseEntity<>(technologyService.createTechnology(technologyDto), HttpStatus.CREATED);
	}


}
