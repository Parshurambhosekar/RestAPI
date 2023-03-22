package com.parshuram.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/welcome")
	public String getMessage() {
		
		String message="Welcome to REST API Development.....";
		
		return "message";
	}
	
	
	@GetMapping("/message")
	public ResponseEntity<String> getMsg(){
		
		String message="REST API with The Status code....";
		
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	
	@GetMapping("/greet)
	public String getGreetMesssage(){
		
		String message="Good Afternoon";
		
		return "message";
	}

}
