package com.hotel.hotel_app.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotel_app.models.Room;
import com.hotel.hotel_app.services.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/available")
    public List<Room> getAvailableRooms(
        @RequestParam String location, 
        @RequestParam String chainName, 
        @RequestParam String roomCapacity, 
        @RequestParam long hotelRating, 
        @RequestParam long minRooms, 
        @RequestParam double maxPrice, 
        @RequestParam Date userEndDate, 
        @RequestParam Date userStartDate) {
        return this.roomService.searchRooms(location, chainName, roomCapacity, hotelRating, minRooms, maxPrice, userEndDate, userStartDate);
    }

    @PostMapping
    public Room createRoom(@RequestBody Room r) {
        return roomService.createRoom(r);
    }

    @PutMapping
    public Room updateRoom(@RequestBody Room room) {
        return roomService.updateRoom(room);
    }

    @DeleteMapping
    public void deleteRoom(@RequestBody Room room) {
        roomService.deleteRoom(room);
    }
}
