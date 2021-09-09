package com.vti.entity;

public class Employee extends User{
	private int ProSkill;

	public Employee(String fullName, String email, String password, int proSkill) {
		super(fullName, email, password);
		ProSkill = proSkill;
	}

	public int getProSkill() {
		return ProSkill;
	}

	public void setProSkill(int proSkill) {
		ProSkill = proSkill;
	}
	
}
