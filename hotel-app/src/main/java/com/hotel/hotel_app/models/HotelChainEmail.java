package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Table(name = "hotelchainemail")
@IdClass(HotelChainEmailPK.class)
public class HotelChainEmail {
    @Id
    private String chain_name;
    @Id
    private String email;
}
