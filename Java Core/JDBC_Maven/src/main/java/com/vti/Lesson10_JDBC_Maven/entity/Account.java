package com.vti.Lesson10_JDBC_Maven.entity;

public class Account {
	int id ; 
	String userName; 
	String fullName;
	String email ;

	public Account(int id, String userName, String fullName, String email) {
		super(); 
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName + "]";
	}
}
