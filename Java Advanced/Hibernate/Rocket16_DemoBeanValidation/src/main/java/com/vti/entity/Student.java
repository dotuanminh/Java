
package com.vti.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

public class Student {
	@Min(value = 1, message = "ID không hợp lệ!!")
//		@Positive
//		@Size(min = 1, max = 3, message = "ID không hợp lệ")
	private int id;
	// @Min(value = 6, message = "Tên không hợp lệ!")
//		@Max(value = 12, message = "Tên không hợp lệ!")
	@Length(min = 6, max = 12, message = "Tên không hợp lệ")
	private String name;
	@Email(message = "Thông tin email không hợp lệ!")
	private String email;
	@Min(value = 18, message = "Tuổi không hợp lệ!")
	private int age;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public Student(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}
