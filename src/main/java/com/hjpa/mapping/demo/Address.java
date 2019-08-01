package com.hjpa.mapping.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private int aid;
	private String street;
	private String city;
	private String pincode;	
	
	public Address(int aid, String street, String city, String pincode) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	
	public Address() {
		super();
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
