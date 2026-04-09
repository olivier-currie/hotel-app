package com.hotel.hotel_app.services;

import com.hotel.hotel_app.models.Booking;
import com.hotel.hotel_app.models.Renting;
import com.hotel.hotel_app.repositories.BookingRepository;
import com.hotel.hotel_app.repositories.RentingRepository;

import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private final BookingRepository bookingR;
    private final RentingRepository rentingR;

    public BookingService(BookingRepository bookingR, RentingRepository rentingR) {
        this.bookingR = bookingR;
        this.rentingR = rentingR;
    }

    public Booking createBooking(Booking booking) {
        return bookingR.save(booking); 
    }

    public Renting turnBookingIntoRenting(Booking booking) {

        Renting renting = new Renting(booking.getRoomNumber(), booking.getHotelID(), booking.getEmployeeID(), booking.getCustomerID(), booking.getStartDate(), booking.getEndDate());
        bookingR.delete(booking);
        return rentingR.save(renting); 
    }

    public void deleteBooking(Booking booking) {
        bookingR.delete(booking);
    }
}