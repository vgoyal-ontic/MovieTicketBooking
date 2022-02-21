package com.TicketBooking.Movie.Ticket.Booking.repository;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.enums.Certificate;
import com.TicketBooking.Movie.Ticket.Booking.enums.Genre;
import com.TicketBooking.Movie.Ticket.Booking.enums.Language;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MovieRepository{

    List<Movie> getMovieOfGenre(Genre genre);
    List<Movie> getMoviesAboveRating(float rating);
    List<Movie> getMovieOfLanguage(Language language);
    Movie getMovieByName(String name);
    List<Movie> getMoviesOfCertificate(Certificate certificate);
}
