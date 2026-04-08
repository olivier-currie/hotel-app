package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private String employee_id;

    private String id_type;

    private Long hotel_id;

    private String name;

    private String address;


    public Employee(String employee_id, String id_type, Long hotel_id, String name, String address) {
        this.employee_id = employee_id;
        this.id_type = id_type;
        this.hotel_id = hotel_id;
        this.name = name;
        this.address = address;
    }

    public String getCustomerID() {return this.employee_id;}
    public String getIDType() {return this.id_type;}
    public Long getHotelID() {return this.hotel_id;}
    public String getName() {return this.name;}
    public String getAddress() {return this.address;}

    public void setCustomerID(String employee_id) {this.employee_id = employee_id;}
    public void setIDType(String id_type) {this.id_type = id_type;}
    public void setHotelID(Long hotel_id) {this.hotel_id = hotel_id;}
    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
}