package com.vti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Address", catalog = "TestingSystem")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Address {
	@Column(name = "AddressID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short AddressID;
	@Column(name = "AddressName", length = 100, nullable = false, unique = true)
	private String AddressName;

}
