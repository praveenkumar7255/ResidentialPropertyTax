package com.example.residentialproperty.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PropertyTaxValueDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int propertyId;
	
	@ManyToOne
    @JoinColumn(name="categoryId")
	private PropertyCategory propertyCategory;
	
	@ManyToOne
    @JoinColumn(name="statusId")
	private PropertyStatus propertyStatus;
	
	@ManyToOne
    @JoinColumn(name="zoneId")
	private PropertyZone propertyZone;
	
	private String propertyDescription;
	
	private String status;
	
	private double taxValue;

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public PropertyCategory getPropertyCategory() {
		return propertyCategory;
	}

	public void setPropertyCategory(PropertyCategory propertyCategory) {
		this.propertyCategory = propertyCategory;
	}

	public PropertyStatus getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(PropertyStatus propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

	public PropertyZone getPropertyZone() {
		return propertyZone;
	}

	public void setPropertyZone(PropertyZone propertyZone) {
		this.propertyZone = propertyZone;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTaxValue() {
		return taxValue;
	}

	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}

	@Override
	public String toString() {
		return "PropertyTaxValueDetails [propertyId=" + propertyId + ", propertyCategory=" + propertyCategory
				+ ", propertyStatus=" + propertyStatus + ", propertyZone=" + propertyZone + ", propertyDescription="
				+ propertyDescription + ", status=" + status + ", taxValue=" + taxValue + "]";
	}
	
}
