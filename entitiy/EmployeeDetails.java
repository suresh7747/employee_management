package com.ems.entitiy;

import java.math.BigInteger;
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
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

@Entity
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeDetailsId;
	@NotBlank(message = "Father's name is required")
	private String fatherName;
	@NotBlank(message = "Mother's name is required")
	private String motherName;
	@NotNull(message = "Date of birth is required")
	@Past(message = "Date of birth must be in the past")
	private Date dateOfBirth;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;

	private String qualification;
	@Min(value = 0, message = "Experience must be a positive value")
	private int experinceInYear;

	private String panNo;
	private double mobileNo;
	@NotBlank(message = "Address is required")
	private String address;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "technology_id")
	private Technology technology;

	public int getEmployeeDetailsId() {
		return employeeDetailsId;
	}

	public void setEmployeeDetailsId(int employeeDetailsId) {
		this.employeeDetailsId = employeeDetailsId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getExperinceInYear() {
		return experinceInYear;
	}

	public void setExperinceInYear(int experinceInYear) {
		this.experinceInYear = experinceInYear;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}


	
	

	

	public double getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(double mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}

	


	public EmployeeDetails(int employeeDetailsId, @NotBlank(message = "Father's name is required") String fatherName,
			@NotBlank(message = "Mother's name is required") String motherName,
			@NotNull(message = "Date of birth is required") @Past(message = "Date of birth must be in the past") Date dateOfBirth,
			Gender gender, String qualification,
			@Min(value = 0, message = "Experience must be a positive value") int experinceInYear, String panNo,
			double mobileNo, @NotBlank(message = "Address is required") String address, Employee employee,
			Technology technology) {
		super();
		this.employeeDetailsId = employeeDetailsId;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.qualification = qualification;
		this.experinceInYear = experinceInYear;
		this.panNo = panNo;
		this.mobileNo = mobileNo;
		this.address = address;
		this.employee = employee;
		this.technology = technology;
	}

	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
