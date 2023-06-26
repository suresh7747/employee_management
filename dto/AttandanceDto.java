package com.ems.dto;

import java.sql.Time;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ems.entitiy.AttandanceSource;
import com.ems.entitiy.EntryType;
import com.ems.entitiy.Status;

public class AttandanceDto {
	@NotNull(message = "Date is required")
	private Date date;
	@NotNull(message = "Intime is required")
	private Time intime;
	@Enumerated(EnumType.STRING)
	private EntryType entryType;
	@Enumerated(EnumType.STRING)
	private Status status;
	@Enumerated(EnumType.STRING)
	private AttandanceSource attandanceSource;
	private String approvedBy;
	private int employee_id;
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String name;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getIntime() {
		return intime;
	}
	public void setIntime(Time intime) {
		this.intime = intime;
	}
	public EntryType getEntryType() {
		return entryType;
	}
	public void setEntryType(EntryType entryType) {
		this.entryType = entryType;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public AttandanceSource getAttandanceSource() {
		return attandanceSource;
	}
	public void setAttandanceSource(AttandanceSource attandanceSource) {
		this.attandanceSource = attandanceSource;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
