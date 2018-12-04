package com.qa.service.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.qa.persistence.domain.Customer;
import com.qa.util.FlightDetailsProducer;

@Component
public class APICaller {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${URL.generator.base}" + "${URL.generator.method}")
	private String flightPrice;

	public String getFlightPrice() {
		return restTemplate.getForObject(flightPrice, String.class);
	}

	// JMS

	@Autowired
	private FlightDetailsProducer producer;

	public void persist(Customer customer) {
		producer.produce(customer);
	}
}
