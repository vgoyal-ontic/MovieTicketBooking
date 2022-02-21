package com.TicketBooking.Movie.Ticket.Booking.controller;


import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.enums.TheatreType;
import com.TicketBooking.Movie.Ticket.Booking.service.impl.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

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
    @GetMapping("/id/{id}")
    public Theatre findById(@PathVariable("id") String id) {

        return theatreService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    @Override
    public void deleteById(@PathVariable("id") String id) {
        theatreService.deleteById(id);
    }

    @PostMapping
    @Override
    public void save(@RequestBody Theatre ob) {
        theatreService.save(ob);
    }

    @GetMapping("/city/{city}")
    public List<Theatre> getTheatresInCity(@PathVariable("city") String city){
        return theatreService.getTheatresInCity(city);
    }

    @GetMapping("/theatreType/{theatreType}")
    public List<Theatre> getTheatreOfChain(@PathVariable("theatreType") String theatreType) {
        return theatreService.getTheatreType(theatreType);
    }
    @GetMapping("/theatreType/{theatreType}/city/{city}")
    public List<Theatre> getTheatreOfCityAndChain(@PathVariable String theatreType,@PathVariable String city){
        return theatreService.getTheatreOfCityAndChain(theatreType,city);
    }

    @GetMapping("/theatreChain/{theatreChain}")
    public List<Theatre> getTheatresOfChain(@PathVariable String theatreChain){
        return theatreService.getTheatresOfChain(theatreChain);

    }

}
