package com.parlourforu.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.parlourforu.model.Customer;

public interface CustomerRepository extends Repository<Customer, String>{
	
	void delete(Customer deleted);
	 
    List<Customer> findAll();
 
    Customer findOne(String id);
 
    Customer save(Customer saved);

}
