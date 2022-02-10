package com.TicketBooking.Movie.Ticket.Booking.repository;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.enums.Genre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MovieRepository{
    public List<Movie> findAllMovies();
    public List<Movie> getAllMoviesOfGenre(Genre genre);
//    public List<Movie> getAllMoviesInCity(String cityName);  //from slotData search if theatre.address.city==cityName
    public Movie getMovieDetailsFromMovieName(String movieName);
    public Movie getMovieFromId(List<String> movieId);






}
