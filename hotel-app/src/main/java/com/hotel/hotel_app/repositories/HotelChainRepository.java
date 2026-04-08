package com.hotel.hotel_app.repositories;

import com.hotel.hotel_app.models.HotelChain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelChainRepository extends JpaRepository<HotelChain, String> {

}