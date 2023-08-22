package com.skcet.day5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day5.model.HotelModel;
import com.skcet.day5.service.hotelservice;

@RestController
public class hotelcontroller {
	@Autowired
	hotelservice ser;
	@PostMapping("/savehotel")
	public HotelModel saveHotelDe(@RequestBody HotelModel hm) {
		return ser.saveDetails(hm);
	}
	
	@PutMapping("/updatehotel")
	public HotelModel updateDetais(@RequestBody HotelModel hm) {
		return ser.updateDetails(hm);
	}
	
	@DeleteMapping("/deleteHotel/{id}")
	public ResponseEntity<String> deleteHotelInfo(@PathVariable int id){
		boolean deleted = ser.deleteHotel(id);
		
		if (deleted) {
			return ResponseEntity.ok("Hotel with ID " + id + " deleted successfully");
		}
		
		else{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel with ID" + id + " not found");
		}
		
	}
	
	@DeleteMapping("/delete4/{hotelid}")
	public String deleteds(@PathVariable("hotelid") int hotelid) {
		
		ser.delete4(hotelid);
		return "name with Id "+hotelid+" is deleted";
	}
	
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<?>getUserId(@PathVariable int userId)
	{
	Optional<HotelModel>hotel=ser.getUserId(userId);
	if(hotel!=null) {
		return ResponseEntity.ok(hotel); 
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID");
		
	}
	
	@GetMapping("/gethotel")
	public List<HotelModel> getHotelDe(){
		return ser.getDetails();
	}
	
	@DeleteMapping("/deletereq")
	public String removedBy(@RequestParam("hotelid") int hotelid)
	{
		ser.deleteHotel(hotelid);
		return "Hotel with Id "+hotelid+" is deleted";
	}
	
}
