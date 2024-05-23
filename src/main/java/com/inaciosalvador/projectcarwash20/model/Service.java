package com.inaciosalvador.projectcarwash20.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "service_db")
@SequenceGenerator(name = "serviceSequence",
				   sequenceName = "serviceSequence",
				   allocationSize = 1,
				   initialValue = 1 )
public class Service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "serviceSequence")
	private Long serviceId;
	private String description;
	private double price;
	
	public Service(Long serviceId, String description, double price) {
		super();
		this.serviceId = serviceId;
		this.description = description;
		this.price = price;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}		

}
