package com.hotel.hotel_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotel_app.models.AvailableRoomsPerArea;

public interface AvailableRoomsPerAreaRepository extends JpaRepository<AvailableRoomsPerArea, String> {

}
