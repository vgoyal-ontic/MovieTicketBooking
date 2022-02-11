package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import com.TicketBooking.Movie.Ticket.Booking.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.net.CacheRequest;
import java.util.List;
@Repository
public class TheatreRepositoryDaoImpl implements TheatreRepository, CommonRepo<Theatre> {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Theatre object) {
        mongoTemplate.save(object);
    }

    @Override
    public Theatre findById(String id) {
        return mongoTemplate.findById(id,Theatre.class);
    }

    @Override
    public void deleteById(String id) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.findAndRemove(query,Theatre.class);

    }

    @Override
    public List<Theatre> findAll() {
        return  mongoTemplate.findAll(Theatre.class);
    }
}
