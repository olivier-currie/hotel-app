package com.hotel.hotel_app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.hotel_app.models.AvailableRoomsPerArea;
import com.hotel.hotel_app.repositories.AvailableRoomsPerAreaRepository;

@Service
public class AvailableRoomsPerAreaService {
    private AvailableRoomsPerAreaRepository arpaR;

    public AvailableRoomsPerAreaService(AvailableRoomsPerAreaRepository arpaR) {
        this.arpaR = arpaR;
    }

    public List<AvailableRoomsPerArea> getAvailableRoomsPerArea() {
        return arpaR.findAll();
    }
}
