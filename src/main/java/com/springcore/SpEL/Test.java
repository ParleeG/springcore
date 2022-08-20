package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;

public class Test {
	@Value("#{22+11}")
	private int a;
	@Value("#{44+33}")
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

}
