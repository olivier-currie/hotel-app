package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Entity
@Table(name="hotel_chain")
public class HotelChain {

    private String name;

    //private String email;

    //private String phone_number;

    private long num_hotels;

    private String address;

    public HotelChain(String name, String email, String phone_number, long num_hotels, String address) {
        this.name = name;
        //this.email = email;
        //this.phone_number = phone_number;
        this.num_hotels = num_hotels;
        this.address = address;
    }

    public String getName() {return this.name;}
    //public String getEmail() {return this.email;}
    //public String getPhone() {return this.phone_number;}
    public Long getNumHotels() {return this.num_hotels;}
    public String getAddress() {return this.address;}
}
