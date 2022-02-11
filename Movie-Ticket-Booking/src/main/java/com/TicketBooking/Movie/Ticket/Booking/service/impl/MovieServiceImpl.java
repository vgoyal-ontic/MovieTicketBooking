package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.MovieQueryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieServiceImpl implements CrudService<Movie> {

    @Autowired
    private MovieQueryDaoImpl movieQueryDao;
    @Override
    public  List<Movie> findAll() {
        return movieQueryDao.findAll();

    }

    @Override
    public Movie findById(String id) {
        return movieQueryDao.findById(id);
    }

    @Override
    public void deleteById(String id) {
        movieQueryDao.deleteById(id);

    }

    @Override
    public void save(Movie ob) {
        movieQueryDao.save(ob);

    }
}
