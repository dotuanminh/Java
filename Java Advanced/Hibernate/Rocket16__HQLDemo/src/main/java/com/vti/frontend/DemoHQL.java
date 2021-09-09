package com.vti.frontend;

import java.util.List;

import com.vti.entity.Account;
import com.vti.repository.AccountRepository;

public class DemoHQL {
	public static void main(String[] args) {

		AccountRepository accountRepository = new AccountRepository();
//		List<Account> list = accountRepository.get_FROM();
//		for (Account account : list) {
//			System.out.println("ID: " + account.getId() + " Email:" + account.getEmail() + " Username: "
//					+ account.getUsername() + " FullName: " + account.getFullname() + " Department: "
//					+ account.getDepartment().getName() + " Possition: " + account.getPosition().getName());
//		}

//		System.out.println("Nhập vào ID của Account cần tìm kiếm: ");
//		int id = ScannerUtils.inputIntPositive();
//		Account account = accountRepository.get_ByID((short) id);
//		System.out.println("ID: " + account.getId() + " Email:" + account.getEmail() + " Username: "
//				+ account.getUsername() + " FullName: " + account.getFullname() + " Department: "
//				+ account.getDepartment().getName() + " Possition: " + account.getPosition().getName());

//		System.out.println("Nhập vào ID của Account cần tìm kiếm: ");
//		int id = ScannerUtils.inputIntPositive();
//		String fullname = accountRepository.get_FullName((short) id);
//		System.out.println("Fullname là: "+ fullname);

//		System.out.println("Thông tin User được tạo trong tháng hiện tại.");
//		List<Account> list = accountRepository.get_ByCurrentMonth();
//		for (Account account : list) {
//			System.out.println("ID: " + account.getId() + " Email:" + account.getEmail() + " Username: "
//					+ account.getUsername() + " FullName: " + account.getFullname() + " Department: "
//					+ account.getDepartment().getName() + " Possition: " + account.getPosition().getName());
//		}

//		System.out.println("Thông tin User được tạo trong tháng hiện tại.");
//		List<Account> list = accountRepository.get_ByCurrentMonthOderBy();
//		for (Account account : list) {
//			System.out.println("ID: " + account.getId() + " Email:" + account.getEmail() + " Username: "
//					+ account.getUsername() + " FullName: " + account.getFullname() + " Department: "
//					+ account.getDepartment().getName() + " Possition: " + account.getPosition().getName()
//					+ " CreateDate: " + account.getCreateDate());
//		}

//		System.out.println("Nhập vào ID cần Update: ");
//		int id = ScannerUtils.inputIntPositive();
//		System.out.println("Nhập vào NewEmail: ");
//		String email = ScannerUtils.inputEmail();
//		System.out.println("Nhập vào NewUsername: ");
//		String username = ScannerUtils.inputString();
//		
//		accountRepository.updateEmailUsernameAccountByID(email, username, (short) id);

//		System.out.println("Nhập vào email cần xóa: ");
//		String email = ScannerUtils.inputEmail();
//		accountRepository.deleteAccount(email);

//		System.out.println("Demo Phân trang với Hibernate: ");
//		List<Account> list = accountRepository.get_AccountByPaging();
//		for (Account account : list) {
//			System.out.println("ID: " + account.getId() + " Email:" + account.getEmail() + " Username: "
//					+ account.getUsername() + " FullName: " + account.getFullname() + " Department: "
//					+ account.getDepartment().getName() + " Possition: " + account.getPosition().getName());
//		}
	}
}
