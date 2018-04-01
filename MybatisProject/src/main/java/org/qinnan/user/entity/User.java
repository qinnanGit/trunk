package org.qinnan.user.entity;

import java.util.Date;

public class User {

	private int userId;
	private String username;
	private String email;
	private String phoneNum;
	private String address;
	private Date birthDay;
	
	
	public User() {
		super();
	}
	public User(int userId, String username, String email, String phoneNum, String address, Date birthDay) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
		this.birthDay = birthDay;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", phoneNum=" + phoneNum
				+ ", address=" + address + ", birthDay=" + birthDay + "]";
	}
}
