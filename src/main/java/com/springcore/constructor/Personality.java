package com.springcore.constructor;

public class Personality {
	private String nickname;
	private String hobby;
	private String achievments;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getAchievments() {
		return achievments;
	}
	public void setAchievments(String achievments) {
		this.achievments = achievments;
	}
	public Personality() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personality(String nickname, String hobby, String achievments) {
		super();
		this.nickname = nickname;
		this.hobby = hobby;
		this.achievments = achievments;
	}
	@Override
	public String toString() {
		return "Personality [nickname=" + nickname + ", hobby=" + hobby + ", achievments=" + achievments + "]";
	}
}
