package com.vti.Lesson10_JDBC_Maven.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	public static final String URL_DB = "jdbc:mysql://localhost:3306/Testing_System_1?autoReconnect=true&useSSL=false&characterEncoding=latin1";
	public static final String USER_DB = "root";
	public static final String PASSWORD = null;
	private static JDBCUtil intance;
	private Connection connection;
	
	public static JDBCUtil getIntance() {
		if (intance == null) {
			intance = new JDBCUtil();
		}
		return intance;
	}
	
	public Connection getConnection() throws SQLException {
		if (connection == null) {
			connection = DriverManager.getConnection(URL_DB, USER_DB, PASSWORD);
		}
		return connection;
	}
	public void closeConnection() throws SQLException{
		if(connection !=null) {
			connection.close();
		}
		connection = null;
	}
	public void removeInstance() throws SQLException {
		closeConnection();
		intance= null;
	}
	
	private JDBCUtil() {
		
	}
	public Statement getStatement(String sqlQuery) throws SQLException {
		Statement statement = getConnection().createStatement();
		return statement;
	}
	
	public PreparedStatement getPreparedStatement(String sqlQuery) throws SQLException {
		PreparedStatement preparedStatement = getConnection().prepareStatement(sqlQuery);
		return preparedStatement ;
	}
}
