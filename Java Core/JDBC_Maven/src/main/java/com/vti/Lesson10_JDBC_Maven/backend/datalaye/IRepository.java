package com.vti.Lesson10_JDBC_Maven.backend.datalaye;

import java.util.List;

import com.vti.Lesson10_JDBC_Maven.entity.Account;

public interface IRepository {
	public List<Account> getListAccount(); 
}
