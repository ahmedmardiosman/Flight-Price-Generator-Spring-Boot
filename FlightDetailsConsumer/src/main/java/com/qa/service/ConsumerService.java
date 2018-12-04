package com.qa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.FlightDetails;
import com.qa.repository.ConsumerRepository;

@Service
public class ConsumerService {

	@Autowired
	private ConsumerRepository consumerRepo;

	public void setRepo(ConsumerRepository persist) {
		this.consumerRepo = persist;
	}

	public Iterable<FlightDetails> getAll() {
		return consumerRepo.findAll();
	}

	public FlightDetails add(FlightDetails flightDetails) {
		return consumerRepo.save(flightDetails);
	}

	public void delete(Long id) {
		consumerRepo.deleteById(id);
	}

	public Optional<FlightDetails> get(Long id) {
		return consumerRepo.findById(id);
	}

}