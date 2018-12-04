package com.qa.service.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Customer;
import com.qa.persistence.repository.FlightPriceRepository;
import com.qa.service.external.APICaller;

@Service
public class FlightPriceServiceImpl implements FlightPriceService {

	@Autowired
	private FlightPriceRepository repo;

	@Autowired
	private APICaller flightPrice;
	
	//jms
	@Autowired
	private APICaller external;

	public Iterable<Customer> getAllCustomers() {
		return repo.findAll();
	}

	public Optional<Customer> getCustomer(Long customerId) {
		return repo.findById(customerId);
	}

	public Customer add(Customer customer) {
		customer.setFlightPrice(flightPrice.getFlightPrice());
		repo.save(customer);
		external.persist(customer);
		return customer; //returns for us the customer details!!!
	}
	
	public String deleteCustomer(Long customerId) {
		repo.deleteById(customerId);
		return "Customer " + customerId +" Deleted";
	}

}
