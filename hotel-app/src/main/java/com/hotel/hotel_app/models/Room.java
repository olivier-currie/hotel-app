package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Entity
@Table(name="room")
@IdClass(RoomPrimaryKey.class)
public class Room {

    @Id
    private Long hotel_id;

    @Id
    private long room_number;

    private String name;

    private long capacity;

    // private String amenities;

    private boolean extendable;

    //@Column(name = "problems/damages")
    //private String problems_damages;

    private String view_type;

    private double price;

    public Room(Long hotel_id, long room_number, String name, long capacity, String amenities, boolean extendable, String problems_damages, String view_type, double price) {
        this.hotel_id = hotel_id;
        this.room_number = room_number;
        this.capacity = capacity;
        //this.amenities = amenities;
        this.extendable = extendable;
        //this.problems_damages = problems_damages;
        this.view_type = view_type;
        this.price = price;
    }

    public Long getHotelID () {return this.hotel_id;}
    public long getRoomNumber() {return room_number;}
    public String getChainName() {return this.name;}
    public long getCapacity() {return this.capacity;}
    //public String getAmenities() {return this.amenities;}
    public boolean isExtendable() {return this.extendable;}
    //public String getProblemsDamages() {return this.problems_damages;}
    public String getViewType() {return this.view_type;}
    public double getPrice() {return this.price;}

    public void setRoomNumber(long room_number) {this.room_number = room_number;}
    public void setHotelID(Long hotel_id) {this.hotel_id = hotel_id;}
    public void setChainName(String name) {this.name = name;}
    public void setCapacity(long capacity) {this.capacity = capacity;}
    //public void setAmenities(String amenities) {this.amenities = amenities;}
    public void setExtendable(boolean extendable) {this.extendable = extendable;}
    //public void setProblemsDamages(String problems_damages) {this.problems_damages = problems_damages;}
    public void setViewType(String view_type) {this.view_type = view_type;}
    public void setPrice(long price) {this.price = price;}
}
