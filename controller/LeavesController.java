package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.dto.LeavesDto;
import com.ems.dto.TechnologyDto;
import com.ems.service.LeavesService;

@RestController
public class LeavesController {
	@Autowired
	private LeavesService leavesService;
	
	@PostMapping("/createleave")
	public ResponseEntity<LeavesDto> createLeave(@RequestBody LeavesDto leavesDto){
		return new ResponseEntity<>(leavesService.createLeave(leavesDto),HttpStatus.CREATED);
	}
	
}
