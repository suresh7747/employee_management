package com.ems.dto;

import com.ems.entitiy.RoleName;

public class RoleDto {
	
	private int role_id; 
	private RoleName roleName;

	public RoleName getRoleName() {
		return roleName;
	}

	public void setRoleName(RoleName roleName) {
		this.roleName = roleName;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
}
