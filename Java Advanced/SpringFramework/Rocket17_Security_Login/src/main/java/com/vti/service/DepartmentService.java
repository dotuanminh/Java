package com.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.vti.dto.filter.DepartmentFilter;
import com.vti.entity.Department;
import com.vti.repository.IDepartmentRepository;
import com.vti.specification.DepartmentSpecification;

@Service
public class DepartmentService implements IDepartmentService {

	@Autowired
	private IDepartmentRepository repository;

	public Page<Department> getAllDepartments(Pageable paging,
			@RequestParam(name = "search", required = false) String search, DepartmentFilter filter) {
		Specification<Department> where = null;

		// search
		if (search != null && !search.isEmpty()) {
			where = new DepartmentSpecification("name", "LIKE", search);
		}

		// min total member
		if (filter != null && filter.getMinTotalMember() != null && filter.getMinTotalMember() > 0) {
			DepartmentSpecification minTotalMemberSpecification = new DepartmentSpecification("totalMember", ">",
					filter.getMinTotalMember());
			if (where == null) {
				where = minTotalMemberSpecification;
			} else {
				where = where.and(minTotalMemberSpecification);
			}
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
}
