package com.hotel.hotel_app.models;

import java.io.Serializable;
import java.util.Objects;

public class RoomPrimaryKey implements Serializable {
    private long hotel_id;

    private long room_number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoomPrimaryKey)) return false;
        RoomPrimaryKey that = (RoomPrimaryKey) o;
        return Objects.equals(hotel_id, that.hotel_id) &&
               Objects.equals(room_number, that.room_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotel_id, room_number);
    }
}
