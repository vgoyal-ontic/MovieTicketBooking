package com.TicketBooking.Movie.Ticket.Booking.controller;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.enums.Genre;
import com.TicketBooking.Movie.Ticket.Booking.enums.Language;
import com.TicketBooking.Movie.Ticket.Booking.service.impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/movies")
public class MovieController implements CrudController<Movie>{

    @Autowired
    private MovieServiceImpl movieService;

    @GetMapping
    @Override
    public List<Movie> findAll() {
        return null;
    }


    @GetMapping("/{id}")
    @Override
    public Movie findById(String id) {
        return movieService.findById(id);
    }


    @DeleteMapping("/{id}")
    @Override
    public void deleteById(String id) {
        movieService.deleteById(id);

    }

    @PostMapping
    @Override
    public void save(@RequestBody Movie ob) {
        movieService.save(ob);

    }
    @GetMapping("/{genre}")
    public List<Movie> getMovieOfGenre(Genre genre) {

        return movieService.getMovieOfGenre(genre);
    }

    @GetMapping("/{rating}")
    public List<Movie> getMoviesAboveRating(float rating) {

        return movieService.getMoviesAboveRating(rating);
    }

    @GetMapping("/{language}")
    public List<Movie> getMovieOfLanguage(Language language) {
        return movieService.getMovieOfLanguage(language);

    }

    @GetMapping("/{name}")
    public Movie getMovieByName(String name) {

        return movieService.getMovieByName(name);

    }

}
