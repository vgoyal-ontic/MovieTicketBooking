package com.TicketBooking.Movie.Ticket.Booking.Models;

import com.TicketBooking.Movie.Ticket.Booking.enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Map;


@Data
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
    private Boolean isAvailable;



}
