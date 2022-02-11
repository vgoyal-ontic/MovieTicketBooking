package com.TicketBooking.Movie.Ticket.Booking.Models;

import com.TicketBooking.Movie.Ticket.Booking.repository.BookingRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookingHistory {

    @Id
    private String id;
    private String userId;
    private String ticketId;
    private Date time;
}
