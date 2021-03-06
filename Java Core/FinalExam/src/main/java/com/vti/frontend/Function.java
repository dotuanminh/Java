package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.presentationlayer.Controller;
import com.vti.backend.presentationlayer.Iview;
import com.vti.entity.User;


public class Function implements Iview{
	private Controller Controller;

	public Function() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		Controller = new Controller(this);
	}

	public void getLogin() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		System.out.print("Mời bạn nhập Email : ");
		String Email = ScannerUtils.inputEmail();
		System.out.print("Mời bạn nhập Password : ");
		String Password = ScannerUtils.inputPassword();
		Controller.isLogin(Email, Password);
	}

	public void getListMemberByProjectID() throws ClassNotFoundException, SQLException {
		System.out.print("Mời bạn nhập Project ID cần tìm : ");
		int id = ScannerUtils.inputInt();
		List<User> list = new ArrayList<User>();
		list = Controller.getListEmployeeInProject(id);
		String AlignFormat = "| %-2d | %-23s | %-20s | %n";
		System.out.format("+-----------------------------------------------------+%n");
		System.out.format("| ID |           Email         |       FullName       |%n");
		System.out.format("+-----------------------------------------------------+%n");
		for (User user : list) {
			System.out.format(AlignFormat, user.getUserID(),user.getEmail(),user.getFullName());
		}
		System.out.format("+-----------------------------------------------------+%n");
	}
	public void getListManagersInProject() throws ClassNotFoundException, SQLException {
		List<User> list = new ArrayList<User>();
		list = Controller.getListManagersInProject();
		System.out.println("\t  	---| Danh sách Manager |--- ");
		String leftAlignFormat = "| %-2d | %-23s | %-20s |%n";
		System.out.format("+-----------------------------------------------------+%n");
		System.out.format("| ID |           Email         |       FullName       |%n");
		System.out.format("+-----------------------------------------------------+%n");
		for (User user : list) {
			System.out.format(leftAlignFormat, user.getUserID(), user.getEmail(), user.getFullName());
		}
		System.out.format("+-----------------------------------------------------+%n");
	}

	public void getLoginAdmin() throws ClassNotFoundException, SQLException {
		System.out.println("chào Manager ");
		
	}

	public void getLoginUser() throws ClassNotFoundException, SQLException {
		System.out.println("chào Employee ");
		
	}
}
