package com.hotel.hotel_app.models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {
    private long room_number;

    private Long hotel_ID;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long booking_id;

    private Long employee_id;

    private String customer_id;

    private Date start_date;

    private Date end_date;

    public Booking(long room_number, Long hotel_ID, Long employee_id, String customer_id, Date start_date, Date end_date) {
        this.room_number = room_number;
        this.hotel_ID = hotel_ID;
        this.employee_id = employee_id;
        this.customer_id = customer_id;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public long getRoomNumber() {return this.room_number;}
    public Long getHotelID() {return this.hotel_ID;}
    public Long getBookingID() {return this.booking_id;}
    public Long getEmployeeID() {return this.employee_id;}
    public String getCustomerID() {return this.customer_id;}
    public Date getStartDate() {return this.start_date;}
    public Date getEndDate() {return this.end_date;}
}
