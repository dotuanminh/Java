package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Department;

public class DepartmentRepository {
	private org.hibernate.SessionFactory sessionFactory;

	public DepartmentRepository() {
		sessionFactory = buildSessionFactory();
	}

	private org.hibernate.SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Department.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);
	}

	@SuppressWarnings("deprecation")
	public List<Department> getAllDepartments() {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query<Department> query = session.createQuery("FROM Department");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Department getDepartmentById(short id) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Department department = session.get(Department.class, id);
			return department;
		} finally {
			if (session != null) {
				session.close();

			}
		}

	}

	public Department getDepartmentByName(String name) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query<Department> query = session.createQuery("FROM Department WHERE name =:nameParameter");
			query.setParameter("nameParameter", name);
			Department department = query.uniqueResult();
			return department;
		} finally {
			if (session != null)
				session.close();
		}
	}

	public void createDepartment(Department department) {

		Session session = null;

		try {

			// get session
			session = sessionFactory.openSession();
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
		Department department = getDepartmentById(id);

		// return result
		if (department == null) {
			return false;
		}

		return true;
	}

	public boolean isDepartmentExistsByName(String name) {
		Department department = getDepartmentByName(name);

		if (department == null) {
			return false;
		}
		return true;
	}

}
