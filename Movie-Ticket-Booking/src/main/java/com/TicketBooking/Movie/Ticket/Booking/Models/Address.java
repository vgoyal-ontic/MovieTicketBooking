package com.TicketBooking.Movie.Ticket.Booking.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
    private String city;
    private String state;
     private String area;
    private String pincode;


}
