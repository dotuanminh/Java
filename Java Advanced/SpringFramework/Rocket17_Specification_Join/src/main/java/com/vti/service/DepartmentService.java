package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.vti.dto.filter.DepartmentFilter;
import com.vti.entity.Department;
import com.vti.repository.IDepartmentRepository;
import com.vti.specification.DepartmentSpecification;

@Service
public class DepartmentService implements IDepartmentService {

	@Autowired
	private IDepartmentRepository repository;

	public Page<Department> getAllDepartments(Pageable paging, String search, DepartmentFilter filter) {
		Specification<Department> where = null;
		if (search != null && !search.isEmpty()) {
			where = new DepartmentSpecification("name", "LIKE", search);
		}

		return repository.findAll(where, paging);
	}

	public Department getDepartmentByID(short id) {
		return repository.findById(id).get();
	}

	public Department getDepartmentByName(String name) {
		return repository.findByName(name);
	}

	public void createDepartment(Department department) {
		repository.save(department);
	}

	public void updateDepartment(Department department) {
		repository.save(department);
	}

	public void deleteDepartment(short id) {
		repository.deleteById(id);
	}

	public boolean isDepartmentExistsByID(short id) {
		return repository.existsById(id);
	}

	public boolean isDepartmentExistsByName(String name) {
		return repository.existsByName(name);
	}

	@Override
	public List<Department> findByNameLike(String name) {
		return repository.findByNameLike(name);
	}

	public List<Department> findAllByOrderByIdDesc() {
		return repository.findAllByOrderByIdDesc();
	}
}
