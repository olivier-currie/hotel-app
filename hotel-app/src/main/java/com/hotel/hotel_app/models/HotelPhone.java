package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Table(name = "hotelphone")
@IdClass(HotelPhonePK.class)
public class HotelPhone { 
    @Id
    private Long hotel_id;
    @Id
    private String phone;
}
