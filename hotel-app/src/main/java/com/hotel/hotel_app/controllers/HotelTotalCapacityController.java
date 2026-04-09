package com.hotel.hotel_app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotel_app.models.HotelTotalCapacity;
import com.hotel.hotel_app.services.HotelTotalCapacityService;

@RestController
@RequestMapping("/api/hoteltotalcapacity")
public class HotelTotalCapacityController {
    private HotelTotalCapacityService htcService;

    public HotelTotalCapacityController(HotelTotalCapacityService htcService) {
        this.htcService = htcService;
    }

    @GetMapping("/hotel-total-capacity")
    public List<HotelTotalCapacity> getHotelTotalCapacity() {
        return htcService.getHotelTotalCapacity();
    }
}
