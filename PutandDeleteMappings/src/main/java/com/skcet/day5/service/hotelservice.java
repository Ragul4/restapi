package com.skcet.day5.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.day5.model.HotelModel;
import com.skcet.day5.repository.hotelrep;

@Service
public class hotelservice {
	@Autowired
	hotelrep hrepo;
	
	public HotelModel saveDetails(HotelModel hm) {
		return hrepo.save(hm);
	}
	
	public HotelModel updateDetails(HotelModel hm) {
		return hrepo.saveAndFlush(hm);
	}
	
	
	public boolean deleteHotel(int hotelId) {
		if(hrepo.existsById(hotelId)) {
			hrepo.deleteById(hotelId);
			return true;
		}
		return false;
	}
	
	public void delete4(int hotelid) {
		System.out.print("Deleted");
		hrepo.deleteById(hotelid);
	}
	
	
	
	public Optional<HotelModel> getUserId(int userId)
	   {
		   Optional<HotelModel>hotel=hrepo.findById(userId);
		   if(hotel.isPresent())
		   {
			   return hotel;
		   }
		   return null;
	   }
	
	
	public List<HotelModel> getDetails(){
		return hrepo.findAll();
	}
}
