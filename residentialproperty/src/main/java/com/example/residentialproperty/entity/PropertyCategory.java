package com.example.residentialproperty.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PropertyCategory { 
	
	@Id
	private int categoryId;
	
	private String description;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PropertyCategory [categoryId=" + categoryId + ", description=" + description + "]";
	}

}
