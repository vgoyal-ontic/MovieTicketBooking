package com.TicketBooking.Movie.Ticket.Booking.Models;

import com.TicketBooking.Movie.Ticket.Booking.enums.SeatType;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Map;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Slot {
    @Id
    private String id;

    private String movieId;
    private String theatreId;

    private Map<SeatType, Integer> availableSeats;
    private Map<SeatType,Integer> ticketsBooked;
    private Integer screenNumber;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(String theatreId) {
        this.theatreId = theatreId;
    }

    public Map<SeatType, Integer> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Map<SeatType, Integer> availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Map<SeatType, Integer> getTicketsBooked() {
        return ticketsBooked;
    }

    public void setTicketsBooked(Map<SeatType, Integer> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    public Integer getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(Integer screenNumber) {
        this.screenNumber = screenNumber;
    }
}
