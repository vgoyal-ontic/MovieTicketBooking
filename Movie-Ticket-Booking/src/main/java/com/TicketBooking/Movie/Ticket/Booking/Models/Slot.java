package com.TicketBooking.Movie.Ticket.Booking.Models;

import com.TicketBooking.Movie.Ticket.Booking.enums.SeatType;
import org.springframework.data.annotation.Id;

import java.util.Map;

public class Slot {
    @Id
    private String id;

    private String movieId;
    private String theatreId;

    private Map<SeatType, Integer> availableSeats;
    private Map<SeatType,Integer> ticketsBooked;
    private Integer screenNumber;


}
