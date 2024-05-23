package com.inaciosalvador.projectcarwash20.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "workOrder_db")
@SequenceGenerator(name = "workOrderSequence",
				   sequenceName = "workOrderSequence",
				   allocationSize = 1,
				   initialValue = 1 )
public class WorkOrder {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workOrderSequence")
	private Long orderId;
	private Long clientId;
	private String observation;
	private double totalValeuService;
	
	public WorkOrder(Long orderId, Long clientId, String observation, double totalValeuService) {
		super();
		this.orderId = orderId;
		this.clientId = clientId;
		this.observation = observation;
		this.totalValeuService = totalValeuService;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public double getTotalValeuService() {
		return totalValeuService;
	}

	public void setTotalValeuService(double totalValeuService) {
		this.totalValeuService = totalValeuService;
	}
		
}
