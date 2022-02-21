package com.TicketBooking.Movie.Ticket.Booking.repository;

import com.TicketBooking.Movie.Ticket.Booking.Models.Slot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SlotRepository {
    //

    List<Slot> getAllSlotsOfMovieAndTheatre(String theatreId, String movieId);
//    Slot getAvailableTickets(String slotId);
//
//    List<Slot> getAllSlotsOfMovieInCity(String cityName, String movieId);
//
//    List<Slot> getAvailableSlotsOfMovieInCity(String cityName, String movieId); //checkAvailable tickets>0
//
//    List<Slot> getAllSlotsOfMovieInTheatre(String theatreId, String movieId);


}
