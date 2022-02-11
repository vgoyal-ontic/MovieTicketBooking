package com.TicketBooking.Movie.Ticket.Booking.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class User {
    @Id
    private String id;
    private String name;
    private String emailId;
    private String mobileNumber;

    public User(String name) {
        this.name = name;
    }

}
