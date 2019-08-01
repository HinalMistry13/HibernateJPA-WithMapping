package com.hjpa.mapping.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int vid;
	private String vname;
	
	@ManyToMany(mappedBy = "vehicle")
	private List<Employee> employees = new ArrayList<Employee>();

	public Vehicle() {
		super();
	}
	
	public Vehicle(int vid, String vname, List<Employee> employees) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.employees = employees;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
