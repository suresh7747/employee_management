package com.ems.dto;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ems.entitiy.LeavePeriod;
import com.ems.entitiy.LeaveType;

public class LeavesDto {


	@NotNull(message = "Start date is required")
	private Date startDate;
	@NotNull(message = "End date is required")
	private Date endDate;

	private LocalTime appliedOn;
	@Enumerated(EnumType.STRING)
	private LeaveType leaveType;
	@NotBlank(message = "Leave message is required")
	private String leaveMsg;
	@Enumerated(EnumType.STRING)
	private LeavePeriod leaveStartDayPeriod;
	@Enumerated(EnumType.STRING)
	private LeavePeriod leaveEndDayPeriod;
	private String approvedBy;
	
	private int employee_id ;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public LocalTime getAppliedOn() {
		return appliedOn;
	}

	public void setAppliedOn(LocalTime appliedOn) {
		this.appliedOn = appliedOn;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public String getLeaveMsg() {
		return leaveMsg;
	}

	public void setLeaveMsg(String leaveMsg) {
		this.leaveMsg = leaveMsg;
	}

	public LeavePeriod getLeaveStartDayPeriod() {
		return leaveStartDayPeriod;
	}

	public void setLeaveStartDayPeriod(LeavePeriod leaveStartDayPeriod) {
		this.leaveStartDayPeriod = leaveStartDayPeriod;
	}

	public LeavePeriod getLeaveEndDayPeriod() {
		return leaveEndDayPeriod;
	}

	public void setLeaveEndDayPeriod(LeavePeriod leaveEndDayPeriod) {
		this.leaveEndDayPeriod = leaveEndDayPeriod;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	
}
