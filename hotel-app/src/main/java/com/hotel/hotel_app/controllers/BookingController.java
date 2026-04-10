package com.hotel.hotel_app.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotel_app.models.Booking;
import com.hotel.hotel_app.models.Renting;
import com.hotel.hotel_app.services.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService; 
    }

    @GetMapping("/getall")
    public List<Booking> getAllBookings() {
        return bookingService.findAll();
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @PutMapping
    public Renting turnBookingIntoRenting(@RequestBody Booking booking) {
        return bookingService.turnBookingIntoRenting(booking);
    }

    @DeleteMapping
    public void deleteBooking(@RequestBody Booking booking) {
        bookingService.deleteBooking(booking);
    }
}
