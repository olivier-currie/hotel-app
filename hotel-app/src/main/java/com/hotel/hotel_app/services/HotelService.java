package com.hotel.hotel_app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.hotel_app.models.Hotel;
import com.hotel.hotel_app.repositories.HotelRepository;

@Service
public class HotelService {
    private final HotelRepository hotelR;

    public HotelService(HotelRepository hotelR) {
        this.hotelR = hotelR;
    }

    public List<Hotel> getAllHotels() {
        return this.hotelR.findAll();
    }

    public Hotel createHotel(Hotel h) {
        return hotelR.save(h);
    }

     public Hotel updateHotel(Hotel h) {
        return hotelR.save(h);
    }

    public void deleteHotel(Hotel h) {
        hotelR.delete(h);
    }
}
