package com.hotel.hotel_app.services;

import com.hotel.hotel_app.models.Room;
import com.hotel.hotel_app.models.RoomPrimaryKey;
import com.hotel.hotel_app.repository.RoomRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomR;

    public RoomService(RoomRepository roomR) {
        this.roomR = roomR;
    }

    public List<Room> searchRooms(String )
}