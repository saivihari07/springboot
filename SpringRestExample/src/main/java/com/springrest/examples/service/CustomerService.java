package com.springrest.examples.service;

import org.springframework.stereotype.Service;

import com.springrest.examples.model.Customer;

@Service
public class CustomerService {

	public CustomerService() {
		System.out.println("customer-service:constructor");
	}
	
	public Customer getCustomer() {
		return new Customer("raju","hyd",24);
	}
}
