package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Table(name = "hotelchainphone")
@IdClass(HotelChainPhonePK.class)
public class HotelChainPhone { 
    @Id
    private String name;
    @Id
    private String phone;
}
