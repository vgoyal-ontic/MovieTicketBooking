package com.TicketBooking.Movie.Ticket.Booking.Models;
import com.TicketBooking.Movie.Ticket.Booking.enums.TheatreChain;
import com.TicketBooking.Movie.Ticket.Booking.enums.TheatreType;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Theatre {
    @Id
    private String id;

    private String ownerId;
    private Address address;
    private TheatreType theatreType;
    private String name;
    private TheatreChain theatreChain;
    private List<Slot> slots;



}
