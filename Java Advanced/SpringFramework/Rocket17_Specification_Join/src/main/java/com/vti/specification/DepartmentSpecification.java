package com.vti.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.vti.entity.Address;
import com.vti.entity.Department;

public class DepartmentSpecification implements Specification<Department> {
	private static final long serialVersionUID = 1L;
	private String field;
	private String operator;
	private Object value;

	public DepartmentSpecification(String field, String operator, Object value) {
		this.field = field;
		this.operator = operator;
		this.value = value;
	}

	@Override
	public Predicate toPredicate(Root<Department> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		if (operator.equalsIgnoreCase("LIKE")) {
			Join<Department, Address> join1 = root.join("address", JoinType.LEFT);
			return criteriaBuilder.like(join1.get("addressName"), "%" + value.toString() + "%");

		}
		return null;
	}

}
