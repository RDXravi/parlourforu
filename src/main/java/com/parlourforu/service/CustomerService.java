package com.parlourforu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parlourforu.model.Customer;
import com.parlourforu.repository.CustomerRepository;

@Service("ICustomerService")
public class CustomerService implements ICustomerService {
	
	@Autowired
	private CustomerRepository customerRepostiory;
	
	@Override
	public Customer create(Customer customer) {
		Customer newCusomter=customerRepostiory.save(customer);
		return newCusomter;
	}

	@Override
	public Customer delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAll() {

		return customerRepostiory.findAll();
	}

	@Override
	public Customer findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
