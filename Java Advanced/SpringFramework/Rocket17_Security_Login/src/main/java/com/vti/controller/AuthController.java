package com.vti.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.UserDTO;
import com.vti.entity.User;
import com.vti.service.IUserService;

@RestController
@RequestMapping(value = "api/v1/login")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class AuthController {
	@Autowired
	private IUserService service;

	@GetMapping()
	public ResponseEntity<?> login(Principal principal) {
		String username = principal.getName();
		User user = service.findByUserName(username);
		UserDTO userDTO = new UserDTO(user.getId(), user.getUserName(), user.getRole(), user.getFullName());
		return new ResponseEntity<>(userDTO, HttpStatus.OK);
	}
}
