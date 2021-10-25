package com.vti.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
	private int id;
	private String username;
	private String role;
	private String fullName;

	public UserDTO(int id, String fullName) {
		this.id = id;
		this.fullName = fullName;
	}
}
