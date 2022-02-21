package com.TicketBooking.Movie.Ticket.Booking.controller;

import com.TicketBooking.Movie.Ticket.Booking.Models.Ticket;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.TicketRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.impl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController implements  CrudController<Ticket>{

    @Autowired
    TicketServiceImpl ticketService;

    @GetMapping
    @Override
    public List<Ticket> findAll() {
        return ticketService.findAll();
    }

    @GetMapping("/{id}")
    @Override
    public Ticket findById(@PathVariable String id) {
        return ticketService.findById(id);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteById(@PathVariable String id) {
        ticketService.deleteById(id);
    }

    @PostMapping
    @Override
    public void save(@RequestBody Ticket ob) {
        ticketService.save(ob);
    }

    @GetMapping("/user/{userId}")
    public List<Ticket> getUserHistory(@PathVariable String userId){
        return ticketService.getUserHistory(userId);
    }
}
