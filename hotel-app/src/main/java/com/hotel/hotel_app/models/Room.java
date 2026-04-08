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

    private long capacity;

    private boolean extendable;

    private String view_type;

    private double price;

    public Room(Long hotel_id, long room_number, long capacity, boolean extendable, String view_type, double price) {
        this.hotel_id = hotel_id;
        this.room_number = room_number;
        this.capacity = capacity;
        this.extendable = extendable;
        this.view_type = view_type;
        this.price = price;
    }

    public Long getHotelID () {return this.hotel_id;}
    public long getRoomNumber() {return room_number;}
    public long getCapacity() {return this.capacity;}
    public boolean isExtendable() {return this.extendable;}
    public String getViewType() {return this.view_type;}
    public double getPrice() {return this.price;}

    public void setRoomNumber(long room_number) {this.room_number = room_number;}
    public void setHotelID(Long hotel_id) {this.hotel_id = hotel_id;}
    public void setCapacity(long capacity) {this.capacity = capacity;}
    public void setExtendable(boolean extendable) {this.extendable = extendable;}
    public void setViewType(String view_type) {this.view_type = view_type;}
    public void setPrice(long price) {this.price = price;}
}
