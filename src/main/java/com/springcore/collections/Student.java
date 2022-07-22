package com.springcore.collections;

import java.util.*;

public class Student {
	private String name;
	private List<String> addresess;
	private Set<String> mobileNumber;
	private Map<String, String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddresess() {
		return addresess;
	}
	public void setAddresess(List<String> addresess) {
		this.addresess = addresess;
	}
	public Set<String> getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Set<String> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Student(String name, List<String> addresess, Set<String> mobileNumber, Map<String, String> courses) {
		super();
		this.name = name;
		this.addresess = addresess;
		this.mobileNumber = mobileNumber;
		this.courses = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
