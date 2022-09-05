package com.springrest.examples.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.examples.model.Customer;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	private List<Customer> theCustomers;
	
	@PostConstruct
	public void getCustomer() {
		theCustomers = new ArrayList<>();
		
		theCustomers.add(new Customer("raju","hyd",23));
		theCustomers.add(new Customer("sai","hyd",24));
		theCustomers.add(new Customer("kailash","hyd",25));
		theCustomers.add(new Customer("suresh","hyd",25));
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return theCustomers;
		
	}
	
	
}
