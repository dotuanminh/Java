package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vti.entity.Department;
import com.vti.utils.HibernateUtils;

public class DepartmentRepository {
	private HibernateUtils hibernateUtils;

	public DepartmentRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("deprecation")
	public List<Department> getAllDepartments() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Department> query = session.createQuery("FROM Department");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Department getDepartmentByName(String name) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			// create hql query
			Query<Department> query = session.createQuery("FROM Department WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Department department = query.uniqueResult();
			return department;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Department getDepartmentByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Department department = session.get(Department.class, id);
			return department;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createDepartment(Department department) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// create
			session.save(department);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isDepartmentExistsByID(short id) {
		// get department
		Department department = getDepartmentByID(id);
		// return result
		if (department == null) {
			return false;
		}
		return true;

	}

	public boolean isDepartmentExistsByName(String name) {
		Department department = getDepartmentByName(name);
		if (department != null) {
			return true;
		}
		return false;
	}
}
