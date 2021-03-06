package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IController {

	public void getAccountMode() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

	public boolean isLogin(String email, String password)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException;

	public List<User> getListEmployeeInProject(int id) throws SQLException, ClassNotFoundException;

	public List<User> getListManagersInProject() throws ClassNotFoundException, SQLException;
}
