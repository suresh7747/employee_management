package com.ems.dto;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ems.entitiy.Activity;
import com.ems.entitiy.Gender;
import com.ems.entitiy.RoleName;

public class EmployeeDetailsDto {
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

	private int employee_id;
	@NotEmpty
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String name;
	@Email
	@NotEmpty
	private String email;
	@Enumerated(EnumType.STRING)
	private Activity activity;
	private int role_id;
	@Enumerated(EnumType.STRING)
	private RoleName roleName;
	private int technology_id;
	@NotNull(message = "technologyName must not be null")
	private String technologyName;

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

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getTechnology_id() {
		return technology_id;
	}

	public void setTechnology_id(int technology_id) {
		this.technology_id = technology_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public RoleName getRoleName() {
		return roleName;
	}

	public void setRoleName(RoleName roleName) {
		this.roleName = roleName;
	}

	
	

}
