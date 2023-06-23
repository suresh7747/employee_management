package com.ems.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.lang.Nullable;

import com.ems.entitiy.Activity;
import com.ems.entitiy.Employee;
import com.ems.entitiy.Role;

public class EmployeeDto {
	@Column(name = "name", nullable = false)
	@NotEmpty
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String name;
	@Email
	@NotEmpty
	private String email;
	@NotEmpty
	@Size(min = 8, message = "password should have at least 8 characters")
	private String password;
	@Enumerated(EnumType.STRING)
	private Activity activity;
	
	private int manager_id;
	private int role_id;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

}
