package com.example.residentialproperty.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PropertyZone {
	
	@Id
	private int zoneId;
	
    private String zoneClassification;

	public int getZoneId() {
		return zoneId;
	}

	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}

	public String getZoneClassification() {
		return zoneClassification;
	}

	public void setZoneClassification(String zoneClassification) {
		this.zoneClassification = zoneClassification;
	}

	@Override
	public String toString() {
		return "PropertyZone [zoneId=" + zoneId + ", zoneClassification=" + zoneClassification + "]";
	}
    
}
