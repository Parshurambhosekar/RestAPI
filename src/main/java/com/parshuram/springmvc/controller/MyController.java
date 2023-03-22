package com.parshuram.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/welcome")
	public String getMessage() {
		
		String message="Welcome to REST API Development.....";
		
		return "message";
	}
	
	
	

}
