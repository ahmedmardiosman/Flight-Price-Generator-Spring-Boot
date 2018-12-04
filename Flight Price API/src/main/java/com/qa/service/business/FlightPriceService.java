package com.qa.service.business;

import java.util.Optional;

import com.qa.persistence.domain.Customer;

public interface FlightPriceService {
	
	Customer add(Customer customer);

	Iterable<Customer> getAllCustomers();

	Optional<Customer> getCustomer(Long customerId);

	String deleteCustomer(Long iD);

}
