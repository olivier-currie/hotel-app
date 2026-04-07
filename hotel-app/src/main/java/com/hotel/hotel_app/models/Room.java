package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Entity
@Table(name="room")
public class Room {

    private long room_number;

    private Long hotel_id;

    private String name;

    private long capacity;

    private String amenities;

    private boolean extendable;

    @Column(name = "problems/damages")
    private String problems_damages;

    private String view_type;

    private double price;

    public Room(long room_number, Long hotel_id, String name, long capacity, String amenities, boolean extendable, String problems_damages, String view_type, double price) {
        this.room_number = room_number;
        this.hotel_id = hotel_id;
        this.capacity = capacity;
        this.amenities = amenities;
        this.extendable = extendable;
        this.problems_damages = problems_damages;
        this.view_type = view_type;
        this.price = price;
    }

    public long getRoomNumber() {return this.room_number;}
    public Long getHotelID() {return this.hotel_id;}
    public String getChainName() {return this.name;}
    public long getCapacity() {return this.capacity;}
    public String getAmenities() {return this.amenities;}
    public boolean isExtendable() {return this.extendable;}
    public String getProblemsDamages() {return this.problems_damages;}
    public String getViewType() {return this.view_type;}
    public double getPrice() {return this.price;}
}
