package com.hotel.hotel_app.models;
import java.util.Objects;
import java.io.Serializable;
public class HotelChainEmailPK implements Serializable {
    private String chain_name;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelChainEmailPK)) return false;
        HotelChainEmailPK that = (HotelChainEmailPK) o;
        return Objects.equals(chain_name, that.chain_name) &&
               Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chain_name, email);
    }
}
