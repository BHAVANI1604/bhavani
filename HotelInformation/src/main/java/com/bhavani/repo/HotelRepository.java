package com.bhavani.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavani.modul.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
