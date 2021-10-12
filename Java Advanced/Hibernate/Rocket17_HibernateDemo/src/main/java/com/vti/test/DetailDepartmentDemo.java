package com.vti.test;

import java.util.List;

import com.vti.entity.DetailDepartment;
import com.vti.repository.DetailDepartmentRepository;

public class DetailDepartmentDemo {
	public static void main(String[] args) {
		DetailDepartmentRepository repository = new DetailDepartmentRepository();
		showAllDetailDepartment();
	}

	private static void showAllDetailDepartment() {
		System.out.println("Danh sách phòng ban trên hệ thống");
		DetailDepartmentRepository depDetailRepository = new DetailDepartmentRepository();
		List<DetailDepartment> list = depDetailRepository.getAllDetailDepartments();
		for (DetailDepartment dep : list) {
			System.out.println("Address: " + dep.getAddress() + " EmulationPoint : " + dep.getEmulationPoint());
		}
	}

}
