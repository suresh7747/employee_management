package com.ems.entitiy;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Leaves {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveId;
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

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Leaves() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leaves(int leaveId, @NotNull(message = "Start date is required") Date startDate,
			@NotNull(message = "End date is required") Date endDate, LocalTime appliedOn, LeaveType leaveType,
			@NotBlank(message = "Leave message is required") String leaveMsg, LeavePeriod leaveStartDayPeriod,
			LeavePeriod leaveEndDayPeriod, String approvedBy, Employee employee) {
		super();
		this.leaveId = leaveId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.appliedOn = appliedOn;
		this.leaveType = leaveType;
		this.leaveMsg = leaveMsg;
		this.leaveStartDayPeriod = leaveStartDayPeriod;
		this.leaveEndDayPeriod = leaveEndDayPeriod;
		this.approvedBy = approvedBy;
		this.employee = employee;
	}

}
