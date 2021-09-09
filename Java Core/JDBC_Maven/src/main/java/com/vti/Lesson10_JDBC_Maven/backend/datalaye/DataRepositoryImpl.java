package com.vti.Lesson10_JDBC_Maven.backend.datalaye;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.Lesson10_JDBC_Maven.entity.Account;
import com.vti.Lesson10_JDBC_Maven.utils.JDBCUtil;

public class DataRepositoryImpl implements IRepository {

	public List<Account> getListAccount(){
		List<Account> list= new ArrayList<Account>();
		try{
			Connection connection = JDBCUtil.getIntance().getConnection();
			String query ="Select * from Account" ;
			Statement statement = JDBCUtil.getIntance().getStatement(query);
			ResultSet resultset = statement.executeQuery(query);
			
			while(resultset.next()) {
				Account account = new Account(
						resultset.getInt("AccountID"),
						resultset.getString("Username"),
						resultset.getString("Fullname"),
						resultset.getString("Email")
						);
				list.add(account);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
