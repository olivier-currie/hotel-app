package com.hotel.hotel_app.models;
import java.util.Objects;
import java.io.Serializable;

public class HotelPhonePK implements Serializable { 
    private Long hotel_id;
    private String phone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelPhonePK)) return false;
        HotelPhonePK that = (HotelPhonePK) o;
        return Objects.equals(hotel_id, that.hotel_id) &&
               Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotel_id, phone);
    }
}
