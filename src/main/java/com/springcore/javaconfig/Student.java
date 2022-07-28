package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("hi")
	private String name;
	@Value("hello")
	private String roll;
	@Autowired
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address=" + address + "]";
	}
//	public Student(String name, String roll, Address address) {
//		super();
//		this.name = name;
//		this.roll = roll;
//		this.address = address;
//	}
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	

}
