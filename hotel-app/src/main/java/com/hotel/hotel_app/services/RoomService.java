package com.hotel.hotel_app.services;

import com.hotel.hotel_app.models.Room;
import com.hotel.hotel_app.models.RoomPrimaryKey;
import com.hotel.hotel_app.repositories.RoomRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.sql.Date;

@Service
public class RoomService {
    private final RoomRepository roomR;

    public RoomService(RoomRepository roomR) {
        this.roomR = roomR;
    }

    public List<Room> searchRooms(String location, String chainName, long roomCapacity, long hotelRating, long minRooms, double maxPrice, Date userEndDate, Date userStartDate) {
        return roomR.findValidRooms(location, chainName, roomCapacity, hotelRating, minRooms, maxPrice, userEndDate, userStartDate);
    }
}