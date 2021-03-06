package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.JDBCUltils;
import com.vti.entity.User;

public class Repository implements IRepository{
	JDBCUltils jdbc;
	public static int accountsta = 0;
	public Repository() throws FileNotFoundException, IOException {
		jdbc = new JDBCUltils();
	}

	public List<User> getListManagers() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<User> listAccounts = new ArrayList<User>();
		String sql = "SELECT UserID, Email, FullName FROM `User` WHERE ROLE = 'MANAGER';";
		ResultSet resultSet = jdbc.executeQuery(sql);
		while (resultSet.next()) {
			User account = new User();
			account.setUserID(resultSet.getInt("UserID"));
			account.setEmail(resultSet.getString("Email"));
			account.setFullName(resultSet.getString("FullName"));
			listAccounts.add(account);
		}
		return listAccounts;

	}
	
	public List<User> getListMemberByProjectId(int id) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String sql = "SELECT ap.UserID, a.Email, a.FullName\r\n"
				+ "FROM AccountProject ap\r\n" 
				+ "INNER JOIN `User` a ON ap.UserID = a.UserID\r\n"
				+ "INNER JOIN Project p ON ap.ProjectID = p.ProjectID\r\n" 
				+ "WHERE ap.ProjectID = (?);";
		List<User> listAccounts = new ArrayList<User>();
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			User user = new User();
			user.setUserID(resultSet.getInt("UserID"));
			user.setEmail(resultSet.getString("Email"));
			user.setFullName(resultSet.getString("FullName"));
			listAccounts.add(user);
		}
		return listAccounts;

	}

	public boolean isLogin(String email, String password) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM `User` WHERE (Email = (?) AND Password = (?))";
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next() == true) {
			if (resultSet.getString("ROLE").equals("MANAGER")) {
				accountsta = 1;
			}
			return true;
		}
		return false;
	}

}
