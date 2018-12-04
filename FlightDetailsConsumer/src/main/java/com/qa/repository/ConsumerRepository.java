package com.qa.repository;



import org.springframework.data.repository.CrudRepository;

import com.qa.persistence.domain.FlightDetails;


public interface ConsumerRepository extends CrudRepository<FlightDetails, Long> {

}