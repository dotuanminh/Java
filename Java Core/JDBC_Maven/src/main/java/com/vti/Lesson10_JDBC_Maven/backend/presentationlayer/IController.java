package com.vti.Lesson10_JDBC_Maven.backend.presentationlayer;

import java.util.List;

import com.vti.Lesson10_JDBC_Maven.entity.Account;

public interface IController {
	public List<Account> getListAccount(int n) ;
	
}
