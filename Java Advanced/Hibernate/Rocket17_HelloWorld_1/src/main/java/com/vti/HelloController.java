package com.vti;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/hello")
public class HelloController {
	@GetMapping
	public String hello() {
		return "Hello World!";
	}
}