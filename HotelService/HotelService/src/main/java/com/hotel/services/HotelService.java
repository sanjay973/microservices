package com.hotel.services;

import com.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    //getAll
    List<Hotel> getAll();

    //get single
    Hotel get(String Id);
}
