package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Customer;

@Repository
public interface FlightPriceRepository extends JpaRepository<Customer, Long> {



}
