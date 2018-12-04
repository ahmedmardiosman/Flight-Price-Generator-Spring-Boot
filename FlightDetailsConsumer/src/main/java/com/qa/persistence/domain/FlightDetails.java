package com.qa.persistence.domain;


import org.springframework.data.annotation.Id;

public class FlightDetails {

	

	private String flightDetails;

	private String date;

	public FlightDetails() {

	}

	public String getDate() {
		return date;
	}

	public String getFlightDetails() {
		return flightDetails;
	}

	
	public void setDate(String date) {
		this.date = date;
	}

	public void setFlightDetails(String flightDetails) {
		this.flightDetails = flightDetails;
	}

	

	@Override
	public String toString() {
		return "Flight Details [flightDetails =" + flightDetails + ", date=" + date + "]";
	}

}
