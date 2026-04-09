package com.hotel.hotel_app.models;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*;

@Entity
@Table(name = "available_rooms_per_area")
@Immutable
public class AvailableRoomsPerArea {
    @Id
    private String area;

    private long roomCount;

    public AvailableRoomsPerArea() {}

    public String getArea() { return area; }
    public long getRoomCount() { return roomCount; }
}
