package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.Utils.ScannerUtils;

public class main {

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Function res = new Function();
		while (true) {

			System.out.println("\t\t --- MENU --- \t\t");
			System.out.println("1. In thông tin người làm project ");
			System.out.println("2. Manager của Project");
			System.out.println("3. Login");
			System.out.println("4. Exit");
			System.out.print("Mời bạn nhập chức năng : ");
			int i = ScannerUtils.inputInt();
			switch (i) {
			case 1:
				res.getListMemberByProjectID();
				break;
			case 2:
				res.getListManagersInProject();
				break;
			case 3:
				res	.getLogin();
				break;
			case 4:
				System.exit(i);
				return;
			default:
				System.err.println("Nhập lại !!!");
				break;
				}
			}
	}
}


