package com.TicketBooking.Movie.Ticket.Booking.repository;

import com.TicketBooking.Movie.Ticket.Booking.Models.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Component
public interface TicketRepository extends MongoRepository<Ticket,String> {

//    public List<Ticket> getTicketsFromIds(List<String> ticketIds);

}
