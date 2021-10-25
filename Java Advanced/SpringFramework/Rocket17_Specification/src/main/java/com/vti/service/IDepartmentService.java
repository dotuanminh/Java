package com.vti.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.dto.filter.DepartmentFilterForm;
import com.vti.entity.Department;

public interface IDepartmentService {

	public Page<Department> getAllDepartments(Pageable paging, String search, DepartmentFilterForm departmentFilter) throws ParseException;

	public Department getDepartmentByID(short id);

	public Department getDepartmentByName(String name);

	public void createDepartment(Department department);

	public void updateDepartment(Department department);

	public void deleteDepartment(short id);

	public boolean isDepartmentExistsByID(short id);

	public boolean isDepartmentExistsByName(String name);

	public List<Department> findByNameLike(String name);

	public List<Department> findAllByOrderByIdDesc();
}
