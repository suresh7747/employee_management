package com.ems.entitiy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class LeaveStatement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveStatementId;
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

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public int getLeaveStatementId() {
		return leaveStatementId;
	}

	public void setLeaveStatementId(int leaveStatementId) {
		this.leaveStatementId = leaveStatementId;
	}

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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public LeaveStatement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LeaveStatement(int leaveStatementId, @NotNull(message = "Year is required") int year,
			@NotNull(message = "Month is required") Month month,
			@Min(value = 0, message = "Opening balance for CL must be non-negative") int openingBalanceCL,
			@Min(value = 0, message = "Opening balance for ML must be non-negative") int openingBalanceML,
			@Min(value = 0, message = "CL used must be non-negative") int clUsed,
			@Min(value = 0, message = "ML used must be non-negative") int mlUsed,
			@Min(value = 0, message = "closingBalanceCL  must be non-negative") int closingBalanceCL,
			@Min(value = 0, message = "closingBalanceML  must be non-negative") int closingBalanceML,
			Employee employee) {
		super();
		this.leaveStatementId = leaveStatementId;
		this.year = year;
		this.month = month;
		this.openingBalanceCL = openingBalanceCL;
		this.openingBalanceML = openingBalanceML;
		this.clUsed = clUsed;
		this.mlUsed = mlUsed;
		this.closingBalanceCL = closingBalanceCL;
		this.closingBalanceML = closingBalanceML;
		this.employee = employee;
	}

}
