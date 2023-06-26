package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.dto.AttandanceDto;

import com.ems.service.AttandanceService;

@RestController
public class AttandanceController {
	@Autowired
	private AttandanceService attandanceService;
	
	@PostMapping("/createAttandance")
    public ResponseEntity<AttandanceDto> createAttendance(@RequestBody AttandanceDto attendanceDto) {
		
        return new ResponseEntity<>(attandanceService.createAttandance(attendanceDto), HttpStatus.CREATED);
    }
	
	

}
