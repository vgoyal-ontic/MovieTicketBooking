package com.TicketBooking.Movie.Ticket.Booking.Models;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class TheatreOwner {
    @Id
    private String id;



    private String name;
    private String mobileNumber;
    private String emailId;
    private List<Theatre> theatres= new ArrayList<>();




}
