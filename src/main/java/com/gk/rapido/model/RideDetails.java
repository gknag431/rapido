package com.gk.rapido.model;

public class RideDetails {
	
	int ride_id;
	String location;
	String destination;
	String rideDate;
	int distance;
	FareData fare;
	public int getRide_id() {
		return ride_id;
	}
	public void setRide_id(int ride_id) {
		this.ride_id = ride_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getRideDate() {
		return rideDate;
	}
	public void setRideDate(String rideDate) {
		this.rideDate = rideDate;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public FareData getFare() {
		return fare;
	}
	public void setFare(FareData fare) {
		this.fare = fare;
	}
	
	

}
