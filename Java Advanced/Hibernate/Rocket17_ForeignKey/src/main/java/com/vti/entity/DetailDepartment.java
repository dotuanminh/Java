package com.vti.entity;

import javax.persistence.Column;

public class DetailDepartment {
	@Column(name = "DepartmentID")
	private short DepartmentID; 
	@Column(name = "AddressID")
	private short AddressID;
	@Column(name = "EmulationPoint")
	private short EmulationPoint;
	
}
