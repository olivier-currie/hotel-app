package com.hotel.hotel_app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.hotel_app.models.HotelTotalCapacity;
import com.hotel.hotel_app.repositories.HotelTotalCapacityRepository;

@Service
public class HotelTotalCapacityService {
    private HotelTotalCapacityRepository htcR;

    public HotelTotalCapacityService(HotelTotalCapacityRepository htcR) {
        this.htcR = htcR;
    }

    public List<HotelTotalCapacity> getHotelTotalCapacity() {
        return htcR.findAll();
    }
}
