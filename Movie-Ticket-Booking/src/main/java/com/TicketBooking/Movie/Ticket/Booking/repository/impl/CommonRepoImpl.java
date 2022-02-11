package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class CommonRepoImpl implements CommonRepo {
    private MongoTemplate mongoTemplate;
    @Override
    public <T> void save(T ob) {
        Query query= new Query();
        mongoTemplate.insert(ob);

    }
    @Override
    public <T> List<T> findAll(Class<T> entityClass){
        return mongoTemplate.findAll(entityClass);
    }

    @Override
    public <T> T findById(String id,Class<T> entityClass) {
        return mongoTemplate.findById(id,entityClass);

    }

    @Override
    public <T> void deleteById(String id,Class<T> entityClass) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.findAndRemove(query,entityClass);

    }

}
