package com.bhavani.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bhavani.modul.Hotel;
import com.bhavani.repo.HotelRepository;

@Repository
public class HotelDAO{

	@Autowired
	HotelRepository hotelrepository;
	
public List<Hotel> getAllinfo() {
	Iterable<Hotel>hotel=hotelrepository.findAll();
	return (List<Hotel>)hotel;
		
	
	}

	public void addDetails(Hotel hotel)
	{
		hotelrepository.save(hotel);
	}

	public Optional<Hotel> getOneHotelDetails(Integer id) {
		Optional<Hotel>hotel=hotelrepository.findById(id);
		return hotel;
	}

	public void updateHotelDetails(Hotel hotel) {
		hotelrepository.save(hotel).getId();
	}

	public void deleteHotelDetails(Integer id) {
	    hotelrepository.deleteById(id);
		
	}

	
	
	}
	

