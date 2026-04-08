package com.hotel.hotel_app.repositories;

import com.hotel.hotel_app.models.Room;
import com.hotel.hotel_app.models.RoomPrimaryKey;
import org.springframework.data.jpa.respository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, RoomPrimaryKey> {
    // I'll implement the custom room search soon
}