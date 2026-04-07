package com.hotel.hotel_app.models;

import jakarta.persistence.*;

@Table(name = "room_problem")
@IdClass(RoomProblemsPK.class)
public class RoomProblems { 
    @Id
    private long room_number;
    @Id
    private Long hotel_id;
    @Id
    private String problem;
}
