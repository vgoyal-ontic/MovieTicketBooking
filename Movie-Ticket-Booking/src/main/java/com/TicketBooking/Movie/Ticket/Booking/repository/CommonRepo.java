package com.TicketBooking.Movie.Ticket.Booking.repository;

import java.util.List;

public interface CommonRepo<T> {

    void save(T object);
    T findById(String id);
    void deleteById(String id);
    List<T> findAll();







}
