package com.bhavani.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhavani.modul.Hotel;
import com.bhavani.service.HotelService;

@RestController
@RequestMapping("/Hotel")
public class HotelController {

	@Autowired
	HotelService hotelService;

	@GetMapping(value = "/getAll")
	public List<Hotel> getAllinfo() {
		return hotelService.getAllinfo();
	}

	@PostMapping("/add")
	public void addHotelDetails(@RequestBody Hotel hotel) {
		hotelService.addDetails(hotel);
	}

	@GetMapping("/findById/{id}")
	public Optional<Hotel> getOneHotelDetails(@PathVariable Integer id) {
		return hotelService.getOneHotelDetails(id);
	}

	@PutMapping("/update")
	public void updateHotelDetails(@RequestBody Hotel hotel) {
		hotelService.updateHotelDetails(hotel);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteHotelDetails(@PathVariable Integer id) {
		hotelService.deleteHotelDetails(id);
	}

}
