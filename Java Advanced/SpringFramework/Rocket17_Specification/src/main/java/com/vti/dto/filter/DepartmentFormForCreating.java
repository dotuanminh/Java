package com.vti.dto.filter;

public class DepartmentFormForCreating {

	private String name;

	private short authorId;

	public DepartmentFormForCreating() {
	}

	
	public DepartmentFormForCreating(String name) {
		this.name = name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setAuthorId(short authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public short getAuthorId() {
		return authorId;
	}

}
