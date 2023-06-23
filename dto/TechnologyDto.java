package com.ems.dto;

import javax.validation.constraints.NotNull;

public class TechnologyDto {
	@NotNull(message = "technologyName must not be null")
	private String technologyName;

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
	

}
