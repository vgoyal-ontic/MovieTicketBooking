package com.TicketBooking.Movie.Ticket.Booking.controller;
import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.service.impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RequestMapping("/movies")
@RestController
public class MovieController implements CrudController<Movie>{

    @Autowired
    private MovieServiceImpl movieService;

    @GetMapping
    @Override
    public List<Movie> findAll() {
        return movieService.findAll();
    }


    @GetMapping("/id/{id}")
    @Override
    public Movie findById(@PathVariable String id) {
        return movieService.findById(id);
    }


    @DeleteMapping("/id/{id}")
    @Override
    public void deleteById(@PathVariable String id) {
        movieService.deleteById(id);

    }

    @PostMapping
    @Override
    public void save(@RequestBody Movie ob) {
        movieService.save(ob);

    }
    @GetMapping("/genre/{genre}")
    public List<Movie> getMovieOfGenre(@PathVariable String genre) {


        return movieService.getMovieOfGenre(genre);
    }

    @GetMapping("/rating/{rating}")
    public List<Movie> getMoviesAboveRating(@PathVariable String rating) {

        return movieService.getMoviesAboveRating(rating);
    }

    @GetMapping("/language/{language}")
    public List<Movie> getMovieOfLanguage(@PathVariable String language) {
        return movieService.getMovieOfLanguage(language);

    }

    @GetMapping("/name/{name}")
    public Movie getMovieByName(@PathVariable String name) {

        return movieService.getMovieByName(name);

    }

}
