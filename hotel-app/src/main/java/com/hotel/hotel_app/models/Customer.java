package com.hotel.hotel_app.models;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private String customer_id;

    private String id_type;

    private String name;

    private String address;

    private Date reg_date;

    public Customer() {}

    public Customer(String customer_id, String id_type, String name, String address, Date reg_date) {
        this.customer_id = customer_id;
        this.id_type = id_type;
        this.name = name;
        this.address = address;
        this.reg_date = reg_date;
    }

    public String getCustomerID() {return this.customer_id;}
    public String getIDType() {return this.id_type;}
    public String getName() {return this.name;}
    public String getAddress() {return this.address;}
    public Date getRegDate() {return this.reg_date;}

    public void setCustomerID(String customer_id) {this.customer_id = customer_id;}
    public void setIDType(String id_type) {this.id_type = id_type;}
    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setRegDate(Date reg_date) {this.reg_date = reg_date;}
}
