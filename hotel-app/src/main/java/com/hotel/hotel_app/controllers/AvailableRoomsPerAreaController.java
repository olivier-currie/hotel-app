package com.hotel.hotel_app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotel_app.models.AvailableRoomsPerArea;
import com.hotel.hotel_app.services.AvailableRoomsPerAreaService;

@RestController
@RequestMapping("/api/availableroomsperarea")
public class AvailableRoomsPerAreaController {
    private AvailableRoomsPerAreaService arpaService;

    public AvailableRoomsPerAreaController(AvailableRoomsPerAreaService arpaService) {
        this.arpaService = arpaService;
    }

    @GetMapping("/available-rooms-per-area")
    public List<AvailableRoomsPerArea> getRoomsPerArea() {
        return arpaService.getAvailableRoomsPerArea();
    }
}
