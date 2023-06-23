package com.ems.entitiy;

import java.sql.Time;
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
import javax.validation.constraints.NotNull;

@Entity
public class Attandance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int attandance_id;
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

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public int getAttandance_id() {
		return attandance_id;
	}

	public void setAttandance_id(int attandance_id) {
		this.attandance_id = attandance_id;
	}

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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Attandance(int attandance_id, @NotNull(message = "Date is required") Date date,
			@NotNull(message = "Intime is required") Time intime, EntryType entryType, Status status,
			AttandanceSource attandanceSource, String approvedBy, Employee employee) {
		super();
		this.attandance_id = attandance_id;
		this.date = date;
		this.intime = intime;
		this.entryType = entryType;
		this.status = status;
		this.attandanceSource = attandanceSource;
		this.approvedBy = approvedBy;
		this.employee = employee;
	}

	public Attandance() {
		super();
		// TODO Auto-generated constructor stub
	}

}
