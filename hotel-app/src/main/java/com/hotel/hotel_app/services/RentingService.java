package com.hotel.hotel_app.services;

import com.hotel.hotel_app.models.Renting;
import com.hotel.hotel_app.repository.RentingRepository;
import org.springframework.stereotype.Service;

@Service
public class RentingService {
    private final RentingRepository rentingR;

    public RentingService(RentingRepository rentingR) {
        this.rentingR = rentingR;
    }

    public Renting createRenting(Renting renting) {
        return rentingR.save(renting);
    }
}