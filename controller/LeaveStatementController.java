package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.dto.LeaveStatementDto;
import com.ems.service.LeaveStatementService;

@RestController
public class LeaveStatementController {
	@Autowired
	private LeaveStatementService leaveStatementService;

	@PostMapping("/createLeaveStatement")
	public ResponseEntity<LeaveStatementDto> createLeaveStatement(@RequestBody LeaveStatementDto leaveStatementDto) {
		return new ResponseEntity<>(leaveStatementService.createLeaveStatement(leaveStatementDto), HttpStatus.CREATED);
	}

}
