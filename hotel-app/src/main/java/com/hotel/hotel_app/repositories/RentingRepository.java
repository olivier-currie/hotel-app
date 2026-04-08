package com.hotel.hotel_app.repositories;

import com.hotel.hotel_app.models.Renting;
import org.springframework.data.jpa.respository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentingRespository extends JpaRepository<Renting, Long> {

}