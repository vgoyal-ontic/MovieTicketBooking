package com.TicketBooking.Movie.Ticket.Booking.repository;

import java.util.List;

public interface CommonRepo {

    <T> void save(T object);
    <T> T findById(String id,Class<T> entityClass);
    <T> void deleteById(String id,Class<T> entityClass);
    <T> List<T> findAll(Class<T> entityClass);







}
