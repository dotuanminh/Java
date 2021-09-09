package com.vti.Lesson10_JDBC_Maven.backend.businesslayer;

import java.util.ArrayList;
import java.util.List;

import com.vti.Lesson10_JDBC_Maven.backend.datalaye.DataRepositoryImpl;
import com.vti.Lesson10_JDBC_Maven.backend.datalaye.IRepository;
import com.vti.Lesson10_JDBC_Maven.backend.presentationlayer.IView;
import com.vti.Lesson10_JDBC_Maven.entity.Account;

public class ServiceImpl implements IService {
	IRepository repository;
	public ServiceImpl(){
		repository = new DataRepositoryImpl(); 
	}
	public List<Account> getListAccount(int n, IView iView) {
		List<Account> list = new ArrayList<Account>();
		try {
			for(int i=0; i<n;++i) {
				list.add(repository.getListAccount().get(i));
			}	
		}catch(IndexOutOfBoundsException e) {
			iView.ShowError("Truyen vao so ngoai pham vi cua mang");
		}
		
		return list;
	}

	
}
