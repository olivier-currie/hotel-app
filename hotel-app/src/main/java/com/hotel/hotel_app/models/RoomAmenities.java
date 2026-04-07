package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Table(name = "room_amenities")
@IdClass(RoomAmenitiesPK.class)
public class RoomAmenities { 
    @Id
    private long room_number;
    @Id
    private Long hotel_id;
    @Id
    private String amenity;
}
