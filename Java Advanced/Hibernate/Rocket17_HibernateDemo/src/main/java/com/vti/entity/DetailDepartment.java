package com.vti.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "DetailDepartment", catalog = "TestingSystem")
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "DepartmentID")
public class DetailDepartment extends Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AddressID", referencedColumnName = "AddressID")
	private Address address;

	@Column(name = "EmulationPoint")
	private short emulationPoint;

}