package com.app.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.BookingDTO;
import com.app.dto.BookingWrapper;
import com.app.service.BookingService;

@RestController
@RequestMapping("/api/booking")
@CrossOrigin(origins = "*")  // Allow all origins for development; modify for production.
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("/createBooking/tour/{tourId}/user/{userId}")
    public ResponseEntity<BookingDTO> createBooking(@RequestBody BookingWrapper bookingWrapper, 
                                                    @PathVariable Long tourId, 
                                                    @PathVariable Long userId) {
        BookingDTO bookingCreated = this.bookingService.createBooking(bookingWrapper.getBookingDto(), 
                                                                      tourId, userId, 
                                                                      bookingWrapper.getTouristDtoList());
        return new ResponseEntity<>(bookingCreated, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{bookingId}")
    public ResponseEntity<ApiResponse> deleteBooking(@PathVariable Long bookingId) {
        this.bookingService.DeleteBookingById(bookingId);
        return new ResponseEntity<>(new ApiResponse("Booking is deleted successfully", false), HttpStatus.OK);
    }

    @GetMapping("/getAllbyuserId/{userId}")
    public ResponseEntity<List<BookingDTO>> getBookingByUserId(@PathVariable Long userId) {
        List<BookingDTO> bookingDto = this.bookingService.getBookingsByUserId(userId);
        return new ResponseEntity<>(bookingDto, HttpStatus.OK);
    }

    @GetMapping("/get/{bookingId}")
    public ResponseEntity<BookingDTO> getBooking(@PathVariable Long bookingId) {
        BookingDTO getBooking = this.bookingService.getBookingById(bookingId);
        return new ResponseEntity<>(getBooking, HttpStatus.OK);
    }

    // For checking purposes only (retrieving all bookings)
    @GetMapping("/getallbookings")
    public ResponseEntity<List<BookingDTO>> getAllBookings() {
        List<BookingDTO> bookingDto = this.bookingService.getAllBooking();
        return new ResponseEntity<>(bookingDto, HttpStatus.OK);
    }

    @GetMapping("/getAllByTourId/{tourId}")
    public ResponseEntity<List<BookingDTO>> getBookingsByTourID(@PathVariable Long tourId) {
        List<BookingDTO> bookingDto = this.bookingService.getBooksByTourID(tourId);
        return new ResponseEntity<>(bookingDto, HttpStatus.OK);
    }

    // For getting the booking by tour date
    @GetMapping("/getbyDate")
    public ResponseEntity<List<BookingDTO>> getBookingsByDuration(@RequestParam LocalDate startdate, 
                                                                  @RequestParam LocalDate lastdate) {
        List<BookingDTO> bookingDto = this.bookingService.getBookingByDuration(startdate, lastdate);
        return new ResponseEntity<>(bookingDto, HttpStatus.OK);
    }
}
