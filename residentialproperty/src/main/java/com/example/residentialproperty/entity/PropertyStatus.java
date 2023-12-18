package com.example.residentialproperty.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PropertyStatus {
	
	@Id
	private int statusId;
	
	private String status;

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PropertyStatus [statusId=" + statusId + ", status=" + status + "]";
	}
	

}
