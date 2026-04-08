package com.hotel.hotel_app.repositories;

import com.hotel.hotel_app.models.Booking;
import org.springframework.data.jpa.respository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRespository extends JpaRepository<Booking, Long> {

}