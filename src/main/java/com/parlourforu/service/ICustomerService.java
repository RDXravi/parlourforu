package com.parlourforu.service;

import java.util.List;

import com.parlourforu.model.Customer;

public interface ICustomerService {

	Customer create(Customer customer);
	 
	Customer delete(String id);
 
    List<Customer> findAll();
 
    Customer findById(String id);
 
    Customer update(Customer customer);
    
}
