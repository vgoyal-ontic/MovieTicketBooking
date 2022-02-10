package com.TicketBooking.Movie.Ticket.Booking.repository;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TheatreRepository extends MongoRepository<Theatre,String> {
//
//    public List<Theatre> getTheatresInCity(String cityName);
//    public List<Theatre> getTopRatedTheatresInCity(String cityName);
//    public List<Movie> getMoviesInTheatre(String theatreId);  //from slots find uniqueMovie Ids corresponding to this theatreId and then and movies from movie Repository
//    public List<Theatre> topRatedTheatres(String cityName);
}
