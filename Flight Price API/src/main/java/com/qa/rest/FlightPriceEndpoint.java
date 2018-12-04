package com.qa.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Customer;
import com.qa.service.business.FlightPriceService;

@CrossOrigin
@RequestMapping("${URL.base}")
@RestController
public class FlightPriceEndpoint {
	
	@Autowired
	private FlightPriceService service;
	
	@GetMapping("${URL.method.getAllCustomers}")
	public Iterable<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}
	
	
	@GetMapping("${URL.method.getCustomer}")
	public Optional<Customer> getCustomer(@PathVariable Long ID) {
		return service.getCustomer(ID);
	}
	
	
	@PostMapping("${URL.method.addDetails}")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.add(customer);
		}
	
	@DeleteMapping("${URL.method.deleteCustomer}")
	public String deleteCustomer(@PathVariable Long ID) {
		return service.deleteCustomer(ID);
	}
	
}
