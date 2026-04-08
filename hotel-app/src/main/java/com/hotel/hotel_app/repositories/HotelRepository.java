package com.hotel.hotel_app.repositories;

import com.hotel.hotel_app.models.Hotel;
import org.springframework.data.jpa.respository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}