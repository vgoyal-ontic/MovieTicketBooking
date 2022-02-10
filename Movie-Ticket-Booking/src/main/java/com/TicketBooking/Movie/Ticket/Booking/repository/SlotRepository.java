package com.TicketBooking.Movie.Ticket.Booking.repository;

import com.TicketBooking.Movie.Ticket.Booking.Models.Slot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SlotRepository extends MongoRepository<Slot,String>{
//
//    public int getAvailableTickets(String slotId);
//    public List<Slot> getAllSlotsOfMovieInCity(String cityName, String movieId);
//
//    public List<Slot> getAvailableSlotsOfMovieInCity(String cityName, String movieId); //checkAvailable tickets>0
//    public List<String> getMovieIdsFromTheatreId(String theatreId);   //search movies in a particular Theatre;
//






}
