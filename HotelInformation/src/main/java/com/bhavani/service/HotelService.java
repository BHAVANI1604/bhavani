package com.bhavani.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavani.dao.HotelDAO;
import com.bhavani.modul.Hotel;


@Service
public class HotelService  {
@Autowired
HotelDAO hotelDAO;
public List<Hotel>getAllinfo(){
return hotelDAO.getAllinfo();
}
public void addDetails(Hotel hotel)
{
hotelDAO.addDetails(hotel);
}
public Optional<Hotel> getOneHotelDetails(Integer id) {
    return hotelDAO.getOneHotelDetails(id);
}
public void updateHotelDetails(Hotel hotel) {
hotelDAO.updateHotelDetails(hotel);

}
public void deleteHotelDetails(Integer id) {
hotelDAO.deleteHotelDetails(id);

}
}


