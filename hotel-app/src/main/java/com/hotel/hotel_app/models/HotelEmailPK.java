package com.hotel.hotel_app.models;

import java.util.Objects;
import java.io.Serializable;
public class HotelEmailPK implements Serializable { 
    private Long hotel_id;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelEmailPK)) return false;
        HotelEmailPK that = (HotelEmailPK) o;
        return Objects.equals(hotel_id, that.hotel_id) &&
               Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotel_id, email);
    }
}
