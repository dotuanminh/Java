package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;
import com.vti.entity.Employee.ProSkill;

public interface IUserService {
	public boolean isEmailExist(String email) throws ClassNotFoundException, SQLException;

	public void Login(String email, String password) throws SQLException, ClassNotFoundException;

	public List<User> getListUser() throws ClassNotFoundException, SQLException;

	public List<User> getListUserByID(int id) throws ClassNotFoundException, SQLException;

	public int deleteUserByID(int id) throws ClassNotFoundException, SQLException;

	public String createEmployee(String fullName, String email, ProSkill proskill)
			throws ClassNotFoundException, SQLException;
}