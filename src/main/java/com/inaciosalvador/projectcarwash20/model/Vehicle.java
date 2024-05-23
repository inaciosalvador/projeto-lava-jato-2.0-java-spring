package com.inaciosalvador.projectcarwash20.model;

import com.inaciosalvador.projectcarwash20.enums.VehicleType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle_db")
@SequenceGenerator(name = "vehicleSequence",
				   sequenceName = "vehicleSequence",
				   allocationSize = 1,
				   initialValue = 1 )
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehicleSequence")
	private Long vehicleId;
	private Long ownerId;
	private String manufacturer;
	private String carModel;
	private VehicleType vehicleType;
	
	public Vehicle(Long vehicleId, Long ownerId, String manufacturer, String carModel, VehicleType vehicleType) {
		super();
		this.vehicleId = vehicleId;
		this.ownerId = ownerId;
		this.manufacturer = manufacturer;
		this.carModel = carModel;
		this.vehicleType = vehicleType;
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
			
}
