package com.hotel.hotel_app.services;

import com.hotel.hotel_app.models.Booking;
import com.hotel.hotel_app.repositories.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private final BookingRepository bookingR;

    public BookingService(BookingRepository bookingR) {
        this.bookingR = bookingR;
    }

    public Booking createBooking(Booking booking) {
        return bookingR.save(booking);
    }
}