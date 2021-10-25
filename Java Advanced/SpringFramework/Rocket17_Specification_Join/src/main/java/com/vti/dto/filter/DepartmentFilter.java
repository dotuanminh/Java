package com.vti.dto.filter;

public class DepartmentFilter {
	private Integer minID;

	private Integer maxID;

	private Integer minTotalMember;

	public DepartmentFilter() {
	}

	public Integer getMinID() {
		return minID;
	}

	public void setMinID(int minID) {
		this.minID = minID;
	}

	public Integer getMaxID() {
		return maxID;
	}

	public void setMaxID(int maxID) {
		this.maxID = maxID;
	}

	public Integer getMinTotalMember() {
		return minTotalMember;
	}

	public void setMinTotalMember(Integer minTotalMember) {
		this.minTotalMember = minTotalMember;
	}
}
