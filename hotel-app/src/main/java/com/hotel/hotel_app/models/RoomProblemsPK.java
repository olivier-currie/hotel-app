package com.hotel.hotel_app.models;
import java.util.Objects;
import java.io.Serializable;

public class RoomProblemsPK implements Serializable {
    private long room_number;
    private Long hotel_id;
    private String problem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoomProblemsPK)) return false;
        RoomProblemsPK that = (RoomProblemsPK) o;
        return Objects.equals(room_number, that.room_number) &&
               Objects.equals(hotel_id, that.hotel_id) &&
               Objects.equals(problem, that.problem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(room_number, hotel_id, problem);
    }
}
