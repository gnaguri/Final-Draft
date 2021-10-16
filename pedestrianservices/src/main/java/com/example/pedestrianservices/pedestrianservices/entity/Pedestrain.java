package com.example.pedestrianservices.pedestrianservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pedestrain {
	
	@Id
	private Integer pedestrainId;
	
	@Column(length = 15)
	private String pedestrainName;

	public Integer getPedestrainId() {
		return pedestrainId;
	}

	public void setPedestrainId(Integer pedestrainId) {
		this.pedestrainId = pedestrainId;
	}

	public String getPedestrainName() {
		return pedestrainName;
	}

	public void setPedestrainName(String pedestrainName) {
		this.pedestrainName = pedestrainName;
	}

	
	

	
	

	

	
	
	
}
