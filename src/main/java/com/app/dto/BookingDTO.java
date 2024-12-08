package com.app.dto;

import java.time.LocalDate;

import com.app.entities.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookingDTO {

	private Long bookingId;
	private LocalDate bookingDate;
	private PaymentStatus paymentStatus;
	private Integer seatCount;
	private Long totalAmount;
//	private TourDetails tourDetails;
	private TourDetailsDTO tourDetails;
	public TourDetailsDTO getTourDetails() {
		return tourDetails;
	}
	public void setTourDetails(TourDetailsDTO tourDetails) {
		this.tourDetails = tourDetails;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
}
