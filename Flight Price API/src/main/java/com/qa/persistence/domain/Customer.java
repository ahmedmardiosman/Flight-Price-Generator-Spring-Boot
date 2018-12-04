package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;

	private String firstName;

	private String secondName;

	private String flightPrice;

	public Customer() {

	}

	public Long getCustomerId() {
		return customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFlightPrice() {
		return flightPrice;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFlightPrice(String flightPrice) {
		this.flightPrice = flightPrice;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

//	@Override
//	public String toString() {
//		return "Customer [customerId = " + customerId + "firstName = " + firstName + ", secondName = " + secondName
//				+ ", flightPrice = " + flightPrice + "]";
//	}

}
