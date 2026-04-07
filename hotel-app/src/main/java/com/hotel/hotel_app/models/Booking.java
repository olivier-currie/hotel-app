package com.hotel.hotel_app.models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {
    private long room_number;

    private Long hotel_ID;

    @Column(name = "ID")
    private Long booking_id;

    private String name;

    private Date start_date;

    private Date end_date;

    public Booking(long room_number, Long hotel_ID, Long booking_id, String name, Date start_date, Date end_date) {
        this.room_number = room_number;
        this.hotel_ID = hotel_ID;
        this.booking_id = booking_id;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public long getRoomNumber() {return this.room_number;}
    public Long getHotelID() {return this.hotel_ID;}
    public Long getBookingID() {return this.booking_id;}
    public String getName() {return this.name;}
    public Date getStartDate() {return this.start_date;}
    public Date getEndDate() {return this.end_date;}
}
