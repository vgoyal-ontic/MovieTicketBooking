package com.TicketBooking.Movie.Ticket.Booking.repository.impl;


import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.enums.Genre;
import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import com.TicketBooking.Movie.Ticket.Booking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public
class MovieQueryDaoImpl implements MovieRepository, CommonRepo<Movie> {


    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Movie object) {
        mongoTemplate.save(object);


    }

    @Override
    public Movie findById(String id) {
        return mongoTemplate.findById(id,Movie.class);
    }

    @Override
    public void deleteById(String id) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.findAndRemove(query,Movie.class);

    }

    @Override
    public List<Movie> findAll() {
        return mongoTemplate.findAll(Movie.class);
    }

    //
//    @Override
//    public List<Movie> findAllMovies() {
//        return mongoTemplate.findAll(Movie.class);
//    }
//
//
//    @Override
//    public List<Movie> getAllMoviesOfGenre(Genre genre) {
//        Query query= new Query();
//        query.addCriteria(Criteria.where("genre").is(genre));
//        return new ArrayList<>(mongoTemplate.find(query,Movie.class));
//
//    }
//
//    @Override
//    public Movie getMovieDetailsFromMovieName(String movieName) {
//        Query query= new Query();
//        query.addCriteria(Criteria.where("name").is(movieName));
//        return (Movie) mongoTemplate.find(query,Movie.class);
//
//
//    }

}
