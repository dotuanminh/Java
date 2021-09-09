package com.vti.backend.businesslayer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.Repository;
import com.vti.entity.User;

public class Service implements IUserService {
	Repository repository;

	public Service() throws FileNotFoundException, IOException {
		// TODO Auto-generated constructor stub
		repository = new Repository();
	}

	public int getAccount() {
		// TODO Auto-generated method stub
		return Repository.accountsta;
	}

	public boolean isLogin(String email, String password) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return repository.isLogin(email, password);
	}


	public List<User> getListMemberByProjectID(int projectID) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return repository.getListMemberByProjectId(projectID);
	}

	public List<User> getListManagers() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return repository.getListManagers();
	}


}
