package com.hotel.hotel_app.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotel_app.models.Renting;
import com.hotel.hotel_app.services.RentingService;

@RestController
@RequestMapping("/api/rooms")
public class RentingController {
    private final RentingService rentingService;

    public RentingController(RentingService rentingService) {
        this.rentingService = rentingService;
    }

    @PostMapping
    public Renting createRenting(@RequestBody Renting renting) {
        return rentingService.createRenting(renting);
    }
}
