package com.TicketBooking.Movie.Ticket.Booking.controller;

import java.util.List;

public interface CrudController<T> {

    List<T> findAll();



    T findById(String id);
    void deleteById(String id);
    void save(T ob);

}
