package com.ems.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.ems.entitiy.Month;

public class LeaveStatementDto {
	
	@NotNull(message = "Year is required")
	private int year;
	@NotNull(message = "Month is required")
	@Enumerated(EnumType.STRING)
	private Month month;
	@Min(value = 0, message = "Opening balance for CL must be non-negative")
	private int openingBalanceCL;
	@Min(value = 0, message = "Opening balance for ML must be non-negative")
	private int openingBalanceML;
	@Min(value = 0, message = "CL used must be non-negative")
	private int clUsed;
	@Min(value = 0, message = "ML used must be non-negative")
	private int mlUsed;
	@Min(value = 0, message = "closingBalanceCL  must be non-negative")
	private int closingBalanceCL;
	@Min(value = 0, message = "closingBalanceML  must be non-negative")
	private int closingBalanceML;
	
	private int employee_id;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public int getOpeningBalanceCL() {
		return openingBalanceCL;
	}

	public void setOpeningBalanceCL(int openingBalanceCL) {
		this.openingBalanceCL = openingBalanceCL;
	}

	public int getOpeningBalanceML() {
		return openingBalanceML;
	}

	public void setOpeningBalanceML(int openingBalanceML) {
		this.openingBalanceML = openingBalanceML;
	}

	public int getClUsed() {
		return clUsed;
	}

	public void setClUsed(int clUsed) {
		this.clUsed = clUsed;
	}

	public int getMlUsed() {
		return mlUsed;
	}

	public void setMlUsed(int mlUsed) {
		this.mlUsed = mlUsed;
	}

	public int getClosingBalanceCL() {
		return closingBalanceCL;
	}

	public void setClosingBalanceCL(int closingBalanceCL) {
		this.closingBalanceCL = closingBalanceCL;
	}

	public int getClosingBalanceML() {
		return closingBalanceML;
	}

	public void setClosingBalanceML(int closingBalanceML) {
		this.closingBalanceML = closingBalanceML;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
}
