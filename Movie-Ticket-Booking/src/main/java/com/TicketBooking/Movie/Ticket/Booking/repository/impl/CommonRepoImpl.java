package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommonRepoImpl  {
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    @Override
//    public <T> void save(T ob) {
//        Query query= new Query();
//        mongoTemplate.save(ob);
//
//    }
//    @Override
//    public <T> List<T> findAll(Class<T> entityClass){
//        return mongoTemplate.findAll(entityClass);
//    }
//
//    @Override
//    public <T> T findById(String id,Class<T> entityClass) {
//        return mongoTemplate.findById(id,entityClass);
//
//    }
//
//    @Override
//    public <T> void deleteById(String id,Class<T> entityClass) {
//        Query query= new Query();
//        query.addCriteria(Criteria.where("id").is(id));
//        mongoTemplate.findAndRemove(query,entityClass);
//
//    }

}
