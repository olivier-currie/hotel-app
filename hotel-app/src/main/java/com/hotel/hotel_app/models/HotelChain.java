package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Entity
@Table(name="hotelchain")
public class HotelChain {

    @Id
    private String name;

    private long num_hotels;

    private String address;

    public HotelChain() {}

    public HotelChain(String name, long num_hotels, String address) {
        this.name = name;
        this.num_hotels = num_hotels;
        this.address = address;
    }

    public String getName() {return this.name;}
    public long getNumHotels() {return this.num_hotels;}
    public String getAddress() {return this.address;}

    public void setName(String name) {this.name = name;}
    public void setNumHotels(long num_hotels) {this.num_hotels = num_hotels;}
    public void setAddress(String address) {this.address = address;}
}
