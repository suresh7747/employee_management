package com.ems.entitiy;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
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

	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	@ManyToOne
	@JoinColumn(name = "manager_id", referencedColumnName = "employee_id")
	private Employee manager;

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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Employee(int employee_id,
			@NotEmpty @Size(min = 2, message = "user name should have at least 2 characters") String name,
			@Email @NotEmpty String email,
			@NotEmpty @Size(min = 8, message = "password should have at least 8 characters") String password,
			Activity activity, Role role, Employee manager, List<Employee> employees) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.activity = activity;
		this.role = role;
		this.manager = manager;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
