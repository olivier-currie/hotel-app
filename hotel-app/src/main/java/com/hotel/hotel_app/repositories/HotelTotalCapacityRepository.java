package com.hotel.hotel_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotel_app.models.HotelTotalCapacity;


public interface HotelTotalCapacityRepository extends JpaRepository<HotelTotalCapacity, Long> {

}
