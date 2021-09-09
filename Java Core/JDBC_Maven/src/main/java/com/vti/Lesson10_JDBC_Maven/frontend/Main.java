package com.vti.Lesson10_JDBC_Maven.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.Lesson10_JDBC_Maven.backend.presentationlayer.ControllerImpl;
import com.vti.Lesson10_JDBC_Maven.backend.presentationlayer.IController;
import com.vti.Lesson10_JDBC_Maven.backend.presentationlayer.IView;
import com.vti.Lesson10_JDBC_Maven.entity.Account;

public class Main{

	public static void main(String[] args) throws SQLException {
		IController controller = new ControllerImpl(new IView() {
			public void ShowError(String errorMsg) {
				System.out.println(errorMsg);
			}
		});
		List<Account> list = controller.getListAccount(3);
		for(Account a:list) {
			System.out.println(a.toString());
		}
	}

}
