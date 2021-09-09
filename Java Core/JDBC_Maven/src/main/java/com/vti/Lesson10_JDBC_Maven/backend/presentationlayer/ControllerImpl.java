package com.vti.Lesson10_JDBC_Maven.backend.presentationlayer;

import java.util.ArrayList;
import java.util.List;

import com.vti.Lesson10_JDBC_Maven.backend.businesslayer.IService;
import com.vti.Lesson10_JDBC_Maven.backend.businesslayer.ServiceImpl;
import com.vti.Lesson10_JDBC_Maven.entity.Account;

public class ControllerImpl implements IController {
	IService iService;
	IView iView ;
	public ControllerImpl(IView v) {
		iService = new ServiceImpl();
		this.iView =v ;
	}

	public List<Account> getListAccount(int n) {
		if (n > 0) {
			return iService.getListAccount(n, iView);
		} else {
			iView.ShowError("Khong truyen duoc so am");
			return new ArrayList<Account>();
		}

	}

	public void ShowError(String errorMsg) {
		// TODO Auto-generated method stub
		
	}

}
