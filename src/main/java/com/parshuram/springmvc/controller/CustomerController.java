package com.parshuram.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parshuram.springmvc.binding.Customer;

@RestController
public class CustomerController {

	
	@GetMapping("/data")
	public Customer getDetailsOfCustomer() {
		
		Customer customer=new Customer();
		customer.setId(101);
		customer.setName("Parshuram");
		customer.setCity("Sangli");
		
		return customer;
	}
	
}
