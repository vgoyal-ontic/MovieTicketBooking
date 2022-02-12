package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.enums.Genre;
import com.TicketBooking.Movie.Ticket.Booking.enums.Language;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.MovieRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class MovieServiceImpl implements CrudService<Movie> {

    @Autowired
    private MovieRepositoryDaoImpl movieQueryDao;
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


    public List<Movie> getMovieOfGenre(Genre genre) {

        return movieQueryDao.getMovieOfGenre(genre);
    }


    public List<Movie> getMoviesAboveRating(float rating) {

        return movieQueryDao.getMoviesAboveRating(rating);


    }


    public List<Movie> getMovieOfLanguage(Language language) {
        return movieQueryDao.getMovieOfLanguage(language);

    }


    public Movie getMovieByName(String name) {

        return movieQueryDao.getMovieByName(name);

    }


}
