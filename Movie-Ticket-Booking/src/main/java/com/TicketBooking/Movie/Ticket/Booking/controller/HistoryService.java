package com.TicketBooking.Movie.Ticket.Booking.controller;
import com.TicketBooking.Movie.Ticket.Booking.Models.BookingHistory;
import com.TicketBooking.Movie.Ticket.Booking.service.impl.BookingHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/history")
public class HistoryService implements CrudController<BookingHistory> {
    @Autowired
    private BookingHistoryService bookingHistoryService;


    @Override
    @GetMapping
    public List<BookingHistory> findAll() {
        return bookingHistoryService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public BookingHistory findById(String id) {
        return bookingHistoryService.findById(id);
    }
    @DeleteMapping("/{id}")
    @Override
    public void deleteById(String id) {
        bookingHistoryService.deleteById(id);

    }

    @PostMapping
    @Override
    public void save(@RequestBody BookingHistory ob) {
        bookingHistoryService.save(ob);

    }

    @GetMapping("/{userId}/history")
    public List<BookingHistory> getUserHistory(String userId){
        return bookingHistoryService.getUserHistory(userId);


    }
}
