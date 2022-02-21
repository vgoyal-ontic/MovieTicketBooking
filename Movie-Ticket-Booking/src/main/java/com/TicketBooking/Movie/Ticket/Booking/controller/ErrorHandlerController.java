package com.TicketBooking.Movie.Ticket.Booking.controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ErrorHandlerController implements ErrorController {


    @GetMapping("/error")
    public String getErrorPath() {
        return "<center><h1>Something went wrong</h1></center>";
    }
}

