package com.skcet.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day5.model.HotelModel;

public interface hotelrep extends JpaRepository<HotelModel, Integer>{
	
}