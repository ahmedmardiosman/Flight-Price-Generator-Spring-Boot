package com.qa.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.persistence.domain.FlightDetails;
import com.qa.service.ConsumerService;

@Component
public class AccountReceiver {

	@Autowired
	private ConsumerService service;

	@JmsListener(destination = "Audit", containerFactory = "myFactory")
	public void receiveMessage(FlightDetails flightDetails) {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		flightDetails.setDate(timestamp);
		service.add(flightDetails);
	}

}