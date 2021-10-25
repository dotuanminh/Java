package com.vti.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.vti.dto.filter.DepartmentFilterForm;
import com.vti.entity.Department;
import com.vti.repository.IDepartmentRepository;
import com.vti.specification.DepartmentSpecification;

@Service
public class DepartmentService implements IDepartmentService {

	@Autowired
	private IDepartmentRepository repository;

	public Page<Department> getAllDepartments(Pageable paging, String search, DepartmentFilterForm departmentFilter)
			throws ParseException {
		Specification<Department> where = null;

		if (!StringUtils.isEmpty(search)) {
			DepartmentSpecification nameSpecification = new DepartmentSpecification("name", "LIKE", search);
			where = Specification.where(nameSpecification);
		}

		if (departmentFilter != null && departmentFilter.getMinDate() != null) {
			DepartmentSpecification minDateSpecification = new DepartmentSpecification("createDate", ">=",
					departmentFilter.getMinDate());
			if (where == null) {
				where = Specification.where(minDateSpecification);
			} else {
				where = where.and(minDateSpecification);
			}
		}

		if (departmentFilter != null && departmentFilter.getMaxDate() != null) {
			DepartmentSpecification maxDateSpecification = new DepartmentSpecification("createDate", "<=",
					departmentFilter.getMaxDate());
			if (where == null) {
				where = Specification.where(maxDateSpecification);
			} else {
				where = where.and(maxDateSpecification);
			}
		}

		if (departmentFilter != null && departmentFilter.getMinYear() != null) {
			Date minDate = new SimpleDateFormat("yyyy-MM-dd").parse(departmentFilter.getMinYear() + "-01-01");
			DepartmentSpecification minYearSpecification = new DepartmentSpecification("createDate", ">=", minDate);
			if (where == null) {
				where = Specification.where(minYearSpecification);
			} else {
				where = where.and(minYearSpecification);
			}
		}

		if (departmentFilter != null && departmentFilter.getMaxYear() != null) {
			Date maxDate = new SimpleDateFormat("yyyy-MM-dd").parse((departmentFilter.getMaxYear() + 1) + "-01-01");
			DepartmentSpecification maxYearSpecification = new DepartmentSpecification("createDate", "<", maxDate);
			if (where == null) {
				where = Specification.where(maxYearSpecification);
			} else {
				where = where.and(maxYearSpecification);
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

	@Override
	public List<Department> findByNameLike(String name) {
		return repository.findByNameLike(name);
	}

	public List<Department> findAllByOrderByIdDesc() {
		return repository.findAllByOrderByIdDesc();
	}
}
