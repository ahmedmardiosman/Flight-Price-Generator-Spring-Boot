package com.qa.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.qa.persistence.domain.Customer;
import com.qa.persistence.domain.FlightDetails;

@Component
public class FlightDetailsProducer {

	private FlightDetails pojoAccount = new FlightDetails();

	@Autowired
	private JmsTemplate jmsTemplate;

	public String produce(Customer customer) {
		pojoAccount.setFlightDetails(customer.toString());
		jmsTemplate.convertAndSend("Audit", pojoAccount);
		return "${successful.message}";
	}
}
