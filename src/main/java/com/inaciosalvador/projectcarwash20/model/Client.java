package com.inaciosalvador.projectcarwash20.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente_db")
@SequenceGenerator(name = "clientSequence",
				   sequenceName = "clientSequence",
				   allocationSize = 1,
				   initialValue = 1 )
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientSequence")
	private Long clienteId;
	private String name;
	private String phone;
	private String taxPayerIdentificationNumber;
	
	@OneToMany
	@JoinColumn(name = "vehicle_id")
	Vehicle vehicle;
	
	public Client(Long clienteId, String name, String phone, String taxPayerIdentificationNumber) {
		super();
		this.clienteId = clienteId;
		this.name = name;
		this.phone = phone;
		this.taxPayerIdentificationNumber = taxPayerIdentificationNumber;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTaxPayerIdentificationNumber() {
		return taxPayerIdentificationNumber;
	}

	public void setTaxPayerIdentificationNumber(String taxPayerIdentificationNumber) {
		this.taxPayerIdentificationNumber = taxPayerIdentificationNumber;
	}
		
}
