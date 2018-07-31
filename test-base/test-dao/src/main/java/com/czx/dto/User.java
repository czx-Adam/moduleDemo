package com.czx.dto;

public class User {

	private String userName;
	private String userAge;
	
	private String userPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public User() {
		this("小二","19","123456");
	}

	public User(String userName, String userAge, String userPassword) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userAge=" + userAge + ", userPassword=" + userPassword + "]";
	}
	
	
}
