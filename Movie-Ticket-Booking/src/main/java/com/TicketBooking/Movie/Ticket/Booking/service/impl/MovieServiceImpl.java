package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.enums.Genre;
import com.TicketBooking.Movie.Ticket.Booking.enums.Language;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.MovieRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
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


    public List<Movie> getMovieOfGenre(String genre) {

        return movieQueryDao.getMovieOfGenre(Genre.valueOf(genre.toUpperCase()));
    }


    public List<Movie> getMoviesAboveRating(String rating1) {

        Float rating= Float.parseFloat(rating1);

        return movieQueryDao.getMoviesAboveRating(rating);


    }


    public List<Movie> getMovieOfLanguage(String language) {
        Language lang= Language.valueOf(language.toUpperCase());
        return movieQueryDao.getMovieOfLanguage(lang);

    }


    public Movie getMovieByName(String name) {

        name= name.toLowerCase();
        return movieQueryDao.getMovieByName(name);

    }


}
