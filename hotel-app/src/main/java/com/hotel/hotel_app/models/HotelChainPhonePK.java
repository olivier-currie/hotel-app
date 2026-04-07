package com.hotel.hotel_app.models;
import java.util.Objects;
import java.io.Serializable;

public class HotelChainPhonePK implements Serializable { 
    private String name;
    private String phone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelChainPhonePK)) return false;
        HotelChainPhonePK that = (HotelChainPhonePK) o;
        return Objects.equals(name, that.name) &&
               Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
