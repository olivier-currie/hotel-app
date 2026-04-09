package com.hotel.hotel_app.models;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*;
@Entity
@Table(name = "hotel_total_capacity")
@Immutable
public class HotelTotalCapacity {
    @Id
    private Long hotel_id;
    private long total_capacity;
    private String name;

    public HotelTotalCapacity() {}

    public Long getHotelID() {return this.hotel_id;}
    public long getTotalCapacity() {return this.total_capacity;}
    public String getName() {return this.name;}
}
