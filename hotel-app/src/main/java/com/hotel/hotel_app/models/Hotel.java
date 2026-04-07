package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Entity
@Table(name="hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotel_ID;

    private String name;

    //private String email;

    //private String phone_number;

    private long num_rooms;

    private long rating;

    private String address;

    public Hotel(Long hotel_ID, String name, String email, String phone_number, long num_rooms, long rating, String address) {
        this.hotel_ID = hotel_ID;
        this.name = name;
        //this.email = email;
        //this.phone_number = phone_number;
        this.num_rooms = num_rooms;
        this.rating = rating;
        this.address = address;
    }

    public Long getHotelID() {return this.hotel_ID;}
    public String getChainName() {return this.name;}
    //public String getEmail() {return this.email;}
    //public String getPhone() {return this.phone_number;}
    public long getNumRooms() {return this.num_rooms;}
    public long getRating() {return this.rating;}
    public String getAddress() {return this.address;}

    public void setHotelID(Long hotel_ID) {this.hotel_ID = hotel_ID;}
    public void setChainName(String name) {this.name = name;}
   // public void setEmail(String email) {this.email = email;}
    //public void setPhone(String phone_number) {this.phone_number = phone_number;}
    public void setNumRooms(long num_rooms) {this.num_rooms = num_rooms;}
    public void setRating(long rating) {this.rating = rating;}
    public void setAddress(String address) {this.address = address;}
}
