package com.TicketBooking.Movie.Ticket.Booking.service;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;

import java.util.List;

public interface CrudService<T> {
     List<T> findAll();
     T findById(String id);
     void deleteById(String id);
     void save(T ob);

}
