package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.net.CacheRequest;
import java.util.List;
@Repository
public class TheatreRepositoryDaoImpl extends CommonRepoImpl implements TheatreRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Theatre> getTheatresInCity(String cityName) {
        Query query= new Query();
        query.addCriteria(Criteria.where("city").is(cityName));
        return mongoTemplate.find(query,Theatre.class);



    }

    @Override
    public List<Theatre> getTopRatedTheatresInCity(String cityName) {
        return null;
    }


}
