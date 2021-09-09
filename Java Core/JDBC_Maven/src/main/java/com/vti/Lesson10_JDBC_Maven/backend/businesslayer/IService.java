package com.vti.Lesson10_JDBC_Maven.backend.businesslayer;

import java.util.List;

import com.vti.Lesson10_JDBC_Maven.backend.presentationlayer.IView;
import com.vti.Lesson10_JDBC_Maven.entity.Account;

public interface IService {
	public List<Account> getListAccount(int n,IView iView);
	
}
