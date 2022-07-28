package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {
	@Value("Rocky Bhai")
	private String studentName;
	@Value("One and only piece")
	private String rollNumber;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public Student(String studentName, String rollNumber) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + "]";
	}
}
