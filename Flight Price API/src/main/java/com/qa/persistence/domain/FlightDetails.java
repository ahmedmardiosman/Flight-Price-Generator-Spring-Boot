package com.qa.persistence.domain;

public class FlightDetails {
	
	private String flightDetails;
	
	private String date;

	
	public FlightDetails() {
		
	}
	
	public String getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(String flightDetails) {
		this.flightDetails = flightDetails;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Flight Details [flightDetails =" + flightDetails + ", date=" + date + "]";
	}
	

}
