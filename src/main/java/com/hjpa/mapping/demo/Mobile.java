package com.hjpa.mapping.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mobile {

	@Id
	@GeneratedValue
	private int mid;
	private String brand;
	private String model;
	
	@ManyToOne
	private Employee employee;

	public Mobile() {
		super();
	}
		
	public Mobile(int mid, String brand, String model, Employee employee) {
		super();
		this.mid = mid;
		this.brand = brand;
		this.model = model;
		this.employee = employee;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
