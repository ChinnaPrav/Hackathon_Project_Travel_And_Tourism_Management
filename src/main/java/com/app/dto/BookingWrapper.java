package com.app.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BookingWrapper {
private BookingDTO bookingDto;
private List<TouristDTO> touristDtoList;
public BookingDTO getBookingDto() {
	// TODO Auto-generated method stub
	return bookingDto;
}
public void setBookingDto(BookingDTO bookingDto) {
    this.bookingDto = bookingDto;
}

public List<TouristDTO> getTouristDtoList() {
    return touristDtoList;
}

public void setTouristDtoList(List<TouristDTO> touristDtoList) {
    this.touristDtoList = touristDtoList;
}
}
