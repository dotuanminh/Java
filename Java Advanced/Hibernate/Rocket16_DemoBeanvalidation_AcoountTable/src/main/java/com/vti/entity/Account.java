package com.vti.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "`Account`", catalog = "TestingSystem")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Account {
	@Column(name = "AccountID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "Email", length = 50, nullable = false, unique = true, updatable = false)
	private String email;

	@Column(name = "Username", length = 50, nullable = false, unique = true, updatable = false)
	private String username;

	@Column(name = "FullName", length = 50, nullable = false)
	private String fullName;

	@ManyToOne
	@JoinColumn(name = "DepartmentID")
	private Department department;

	@ManyToOne
	@JoinColumn(name = "PositionID")
	private Position position;

	@Column(name = "CreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createDate;

	public Account(String email, String username, String fullName, Department department) {
		super();
		this.email = email;
		this.username = username;
		this.fullName = fullName;
		this.department = department;
	}

}
