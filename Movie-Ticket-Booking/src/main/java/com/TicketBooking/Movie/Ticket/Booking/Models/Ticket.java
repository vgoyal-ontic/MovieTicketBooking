package com.TicketBooking.Movie.Ticket.Booking.Models;

import com.TicketBooking.Movie.Ticket.Booking.enums.SeatType;
import com.TicketBooking.Movie.Ticket.Booking.repository.TicketRepository;
import com.TicketBooking.Movie.Ticket.Booking.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    private SeatType seatType;
    private  String id;
    private String theatreID;
    private String movieID;
    private int seatNumber;
    private Date date;

}
