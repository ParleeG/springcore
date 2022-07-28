package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value("Delhi")
	private String street;
	@Value("Delhi")
	private String state;
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String state) {
		super();
		this.street = street;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + "]";
	}
	

}
