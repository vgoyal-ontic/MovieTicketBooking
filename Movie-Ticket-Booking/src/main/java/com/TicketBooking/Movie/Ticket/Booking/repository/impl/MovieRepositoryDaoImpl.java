package com.TicketBooking.Movie.Ticket.Booking.repository.impl;


import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.config.MongoConfig;
import com.TicketBooking.Movie.Ticket.Booking.enums.Certificate;
import com.TicketBooking.Movie.Ticket.Booking.enums.Genre;
import com.TicketBooking.Movie.Ticket.Booking.enums.Language;
import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import com.TicketBooking.Movie.Ticket.Booking.repository.MovieRepository;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepositoryDaoImpl implements MovieRepository, CommonRepo<Movie> {
    @Autowired
    private MongoTemplate mongoTemplate;
////
////    public MovieRepositoryDaoImpl(){
////
////        this.mongoTemplate= new MongoTemplate((MongoClient) MongoConfig.mongo,"BookMyShow");
////
//    }
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

    @Override
    public List<Movie> getMovieOfGenre(Genre genre) {
        Query query= new Query();
        query.addCriteria(Criteria.where("genre").is(genre));


        return mongoTemplate.find(query,Movie.class);
    }

    @Override
    public List<Movie> getMoviesAboveRating(float rating) {
        Query query= new Query();
        query.addCriteria(Criteria.where("rating").gte(rating));

        return mongoTemplate.find(query,Movie.class);

    }

    @Override
    public List<Movie> getMovieOfLanguage(Language language) {

        Query query= new Query();
        query.addCriteria(Criteria.where("language").is(language));

        return mongoTemplate.find(query,Movie.class);

    }

    @Override
    public Movie getMovieByName(String name) {
        Query query= new Query();
        query.addCriteria(Criteria.where("name").is(name));

        return mongoTemplate.findOne(query,Movie.class);
    }

    @Override
    public List<Movie> getMoviesOfCertificate(Certificate certificate){

        Query query= new Query();
        query.addCriteria(Criteria.where("certificate").is(certificate));
        return mongoTemplate.find(query,Movie.class);
    }


}
