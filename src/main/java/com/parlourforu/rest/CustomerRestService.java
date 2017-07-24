/**
 * 
 */
package com.parlourforu.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parlourforu.model.Customer;
import com.parlourforu.service.ICustomerService;

/**
 * @author Dixit
 *
 */
@RestController
@RequestMapping("/api/customer")
@Component
public class CustomerRestService {

	@Autowired
	private ICustomerService customerService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	Customer create(@RequestBody @Valid Customer customer) {
		return customerService.create(customer);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	Customer delete(@PathVariable("id") String id) {
		return customerService.delete(id);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	List<Customer> findAll() {
		return customerService.findAll();
	}

	@RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
	Customer findById(@PathVariable("id") String id) {
		return customerService.findById(id);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	Customer update(@RequestBody @Valid Customer todoEntry) {
		return customerService.update(todoEntry);
	}

	/*
	 * @ExceptionHandler
	 * 
	 * @ResponseStatus(HttpStatus.NOT_FOUND) public void
	 * handleTodoNotFound(TodoNotFoundException ex) { }
	 */

}
