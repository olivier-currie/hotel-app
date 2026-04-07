package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Table(name = "hotelemail")
@IdClass(HotelEmailPK.class)
public class HotelEmail { 
    @Id
    private Long hotel_id;
    @Id
    private String email;
}
