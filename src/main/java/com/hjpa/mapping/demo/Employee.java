package com.hjpa.mapping.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int eid;
	private String ename;
	
	@OneToOne
	@JoinColumn(name = "address")
	private Address address;
	
	@OneToMany(mappedBy = "employee")
	private List<Mobile> mobile = new ArrayList<Mobile>();
	
	@ManyToMany
	private List<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public Employee(int eid, String ename, Address address, List<Mobile> mobile, List<Vehicle> vehicle) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		this.mobile = mobile;
		this.vehicle = vehicle;
	}

	public Employee() {
		super();
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	
}
