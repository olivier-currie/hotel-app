package com.hotel.hotel_app.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hotel.hotel_app.models.Renting;

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
