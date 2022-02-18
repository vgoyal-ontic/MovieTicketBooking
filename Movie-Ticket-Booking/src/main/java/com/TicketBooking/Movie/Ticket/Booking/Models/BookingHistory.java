package com.TicketBooking.Movie.Ticket.Booking.Models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
