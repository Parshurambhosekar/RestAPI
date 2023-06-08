package com.parshuram.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parshuram.springmvc.binding.Customer;

@RestController
public class CustomerController {

	
	@GetMapping(
			value = "/customer",
			produces = {"application/xml","application/Json"}
			//which type of data will get from client
			//by default it is jason
			//if we want xml then we must annote binding class with xmlRootElement
	)
	public Customer getDetailsOfCustomer() {
		
		Customer customer=new Customer();
		customer.setId(101);
		customer.setName("Parshuram");
		customer.setCity("Sangli");
		
		return customer;
	}
	
	
	@PostMapping(
			value = "/customer",
			consumes = {"application/xml","application/Json"},
			//it data you want to send to a server xml or json
			produces = {"text/plain"}		
			//what is gives from client
	)
	public ResponseEntity<String> saveCustomerData(@RequestBody Customer customer){
		
		System.out.println("customer Data....."+customer);
		
		return new ResponseEntity<String>("Customer Saved....", HttpStatus.CREATED);
		
	}
	
	
	
}
