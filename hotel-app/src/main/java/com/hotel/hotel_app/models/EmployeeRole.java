package com.hotel.hotel_app.models;
import jakarta.persistence.*;

@Table(name = "employee_role")
@IdClass(EmployeeRolePK.class)
public class EmployeeRole {
    @Id
    private Long employee_id;
    @Id
    private String role;
}
