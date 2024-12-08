package com.app.dto;

import java.time.LocalDate;

import com.app.entities.TourTypeEnum;
import com.app.entities.TransportationMode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TourDetailsDTO {
	private Long tourId;
	private String tourName;
	private String source;
	private String destination;
	private String activities;
	private Double bookingAmount;
	private String tourDetailInfo;
	private LocalDate tourStartDate;
	private LocalDate tourEndDate;
	private Integer maxSeats;
	private TransportationMode transportationMode;
	private TourTypeEnum tourType;
	public Long getTourId() {
		return tourId;
	}
	public void setTourId(Long tourId) {
		this.tourId = tourId;
	}
	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getActivities() {
		return activities;
	}
	public void setActivities(String activities) {
		this.activities = activities;
	}
	public Double getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(Double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public String getTourDetailInfo() {
		return tourDetailInfo;
	}
	public void setTourDetailInfo(String tourDetailInfo) {
		this.tourDetailInfo = tourDetailInfo;
	}
	public LocalDate getTourStartDate() {
		return tourStartDate;
	}
	public void setTourStartDate(LocalDate tourStartDate) {
		this.tourStartDate = tourStartDate;
	}
	public LocalDate getTourEndDate() {
		return tourEndDate;
	}
	public void setTourEndDate(LocalDate tourEndDate) {
		this.tourEndDate = tourEndDate;
	}
	public Integer getMaxSeats() {
		return maxSeats;
	}
	public void setMaxSeats(Integer maxSeats) {
		this.maxSeats = maxSeats;
	}
	public TransportationMode getTransportationMode() {
		return transportationMode;
	}
	public void setTransportationMode(TransportationMode transportationMode) {
		this.transportationMode = transportationMode;
	}
	public TourTypeEnum getTourType() {
		return tourType;
	}
	public void setTourType(TourTypeEnum tourType) {
		this.tourType = tourType;
	}
}
