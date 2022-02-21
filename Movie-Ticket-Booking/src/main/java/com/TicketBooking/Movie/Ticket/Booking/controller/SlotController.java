package com.TicketBooking.Movie.Ticket.Booking.controller;

import com.TicketBooking.Movie.Ticket.Booking.Models.Slot;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.SlotRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.impl.SlotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/slot")
@RestController
public class SlotController implements CrudController<Slot>{

    @Autowired
    SlotServiceImpl slotService;

    @GetMapping
    @Override
    public List<Slot> findAll() {
        return slotService.findAll();
    }

    @GetMapping("/{id}")
    @Override
    public Slot findById(@PathVariable String id) {
        return slotService.findById(id);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteById(@PathVariable String id) {
        slotService.deleteById(id);
    }

    @PostMapping
    @Override
    public void save(@RequestBody Slot ob) {
        slotService.save(ob);
    }

    @GetMapping("/theatre/{theatreId}/movie/{movieId}")
    public List<Slot> getAllSlotsOfMovieAndTheatre(@PathVariable String theatreId,@PathVariable String movieId) {

        return slotService.getAllSlotsOfMovieAndTheatre(theatreId,movieId);

    }
    @GetMapping("{slotId}/availableSeats")
    public String getAvailableSeats(@PathVariable String slotId){
        return  slotService.getAvailableSeats(slotId);
    }

    @GetMapping("/bookTicket/{slotId}/{seatType}/{quantity}")
    public String bookTicket(@PathVariable String slotId,@PathVariable String seatType,@PathVariable String quantity ){
        return  slotService.bookTicket(slotId,seatType,quantity);
    }

}
