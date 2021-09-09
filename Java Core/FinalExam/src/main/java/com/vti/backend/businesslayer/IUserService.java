package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IUserService {
	public int getAccount();

	public List<User> getListMemberByProjectID(int projectID) throws ClassNotFoundException, SQLException;

	public List<User> getListManagers() throws ClassNotFoundException, SQLException;

	public boolean isLogin(String email, String password) throws ClassNotFoundException, SQLException;
}
