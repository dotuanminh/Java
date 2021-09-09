package com.vti.entity;

public class Manager extends User{
	private int expInYear;

	public Manager(String fullName, String email, String password,  int expInYear) {
		super(fullName, email, password);
		this.expInYear = expInYear;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	
	
}
