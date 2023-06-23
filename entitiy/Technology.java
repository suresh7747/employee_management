package com.ems.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Technology {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int technologyId;
	@NotNull(message = "technologyName must not be null")
	private String technologyName;

	public int getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technology(int technologyId, @NotNull(message = "technologyName must not be null") String technologyName) {
		super();
		this.technologyId = technologyId;
		this.technologyName = technologyName;
	}

}
