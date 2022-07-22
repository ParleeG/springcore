package com.springcore.constructor;

public class Person {
	private String name;
	private int noOfResidence;
	private Personality personality;
	public String getNickname() {
		return name;
	}
	public void setNickname(String name) {
		this.name = name;
	}
	public int getNoOfResidence() {
		return noOfResidence;
	}
	public void setNoOfResidence(int noOfResidence) {
		this.noOfResidence = noOfResidence;
	}
	public Personality getPersonality() {
		return personality;
	}
	public void setPersonality(Personality personality) {
		this.personality = personality;
	}
	public Person(String name, int noOfResidence, Personality personality) {
		super();
		this.name = name;
		this.noOfResidence = noOfResidence;
		this.personality = personality;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", noOfResidence=" + noOfResidence + ", personality=" + personality
				+ "]";
	}

}
