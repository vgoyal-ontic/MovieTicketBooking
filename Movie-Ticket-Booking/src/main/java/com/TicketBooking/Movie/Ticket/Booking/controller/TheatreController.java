package com.TicketBooking.Movie.Ticket.Booking.controller;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.service.impl.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/theatres")
@RestController
public class TheatreController implements CrudController<Theatre> {

    @Autowired
    TheatreServiceImpl theatreService;

    @Override
    @GetMapping
    public List<Theatre> findAll() {
        return theatreService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Theatre findById(String id) {
        return theatreService.findById(id);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteById(String id) {
        theatreService.deleteById(id);

    }
    @PostMapping
    @Override
    public void save(@RequestBody Theatre ob) {
        theatreService.save(ob);

    }
    @GetMapping("/{city}")
    public List<Theatre> getTheatresInCity(String city){
        return theatreService.getTheatresInCity(city);


    }
    @GetMapping("/theatreType")
    public List<Theatre> getTheatreOfChain(String theatreType) {

        return theatreService.getTheatreOfChain(theatreType);

    }
    @GetMapping("/{theatreType}/{city}")
    public List<Theatre> getTheatreOfCityAndChain(String theatreType,String city){
        return theatreService.getTheatreOfCityAndChain(theatreType,city);
    }
//    @GetMapping("/{theatreId}/movies")
//    public List<Movie> getAllMovies(String theatreId){
//        return  theatreService.getAllMovies(theatreId);
//
//    }
}
