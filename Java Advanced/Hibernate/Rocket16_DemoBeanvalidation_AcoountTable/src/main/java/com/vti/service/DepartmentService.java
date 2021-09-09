package com.vti.service;

import java.util.List;

import com.vti.datalayer.DepartmentRepository;
import com.vti.entity.Department;

public class DepartmentService {
	private DepartmentRepository DepRepository;

	public DepartmentService() {
		DepRepository = new DepartmentRepository();
	}

	@SuppressWarnings("unchecked")
	public List<Department> getAllDepartmentAccounts() {

		return DepRepository.getAllDepartment();
	}

}

