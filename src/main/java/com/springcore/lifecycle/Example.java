package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private int digit;

	public int getDigit() {
		return digit;
	}

	public void setDigit(int digit) {
		System.out.println("setting value");
		this.digit = digit;
	}

	public Example(int digit) {
		super();
		this.digit = digit;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [digit=" + digit + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside the init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside the destroy method");
	}

}
