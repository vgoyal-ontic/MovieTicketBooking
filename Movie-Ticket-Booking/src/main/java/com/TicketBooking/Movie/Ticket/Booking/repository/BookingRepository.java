package com.TicketBooking.Movie.Ticket.Booking.repository;

import com.TicketBooking.Movie.Ticket.Booking.Models.BookingHistory;
import com.TicketBooking.Movie.Ticket.Booking.Models.Ticket;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;


public interface BookingRepository {

    List<BookingHistory> getUserHistory(String userId);
//    List<BookingHistory> getAllBookingsInTheatre(String userId,String theatreId);

}
