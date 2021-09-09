package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IRepository {
		
		public boolean isLogin(String email, String password) throws ClassNotFoundException, SQLException;
		
		public List<User> getListMemberByProjectId(int id) throws SQLException, ClassNotFoundException;

		public List<User> getListManagers() throws ClassNotFoundException, SQLException;

	}

