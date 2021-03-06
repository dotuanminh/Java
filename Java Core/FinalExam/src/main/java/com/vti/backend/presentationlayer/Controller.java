package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.Service;
import com.vti.entity.User;

public class Controller implements IController{
	Service service;
	Iview iview;
	public Controller(Iview iview) throws FileNotFoundException, IOException {
		// TODO Auto-generated constructor stub
		service = new Service();
		this.iview = iview;
	}
	public void getAccountMode() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		if(service.getAccount()==1) {
			iview.getLoginAdmin();
		}else {
			iview.getLoginUser();
		}	
		
	}
	

	public boolean isLogin(String email, String password) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		if (!service.isLogin(email, password)) {
			System.out.println("Tài khoản hoặc mật khẩu sai !");
			return false;
		}
		// login success
		getAccountMode();
		return service.isLogin(email, password);
	}
	public List<User> getListEmployeeInProject(int id) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return service.getListMemberByProjectID(id);
	}
	public List<User> getListManagersInProject() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return service.getListManagers();
	}

}
