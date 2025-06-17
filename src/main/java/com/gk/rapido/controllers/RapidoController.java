package com.gk.rapido.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gk.rapido.model.FareData;
import com.gk.rapido.model.RideDetails;
import com.gk.rapido.model.RideRequest;

@RestController
public class RapidoController {
	
	@GetMapping("/getride") 
	public String getRapidoRide() {
		System.out.println("we are into rapido controller");
		return " Welcome Rapido ";
	}
	
	@GetMapping("/getfare/{rideid}")
	public int getRideFare(@PathVariable int  rideid) {
		int fare=rideid+10;
		return fare;
	}
	
	@PostMapping("/getRideDetails")
	public RideDetails getRideDetails(@RequestBody RideRequest riderq ) {
		
		RideDetails rd=new RideDetails();
		FareData fare=new FareData();
		fare.setNormalFare(10*riderq.getDistance());
		fare.setPeekHrsFare(25*riderq.getDistance());
		rd.setFare(fare);
		rd.setDestination("madhapur");
		rd.setLocation("chandanagar");
		rd.setRideDate("16th June 2025");	
		return rd;
	}

}
