package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Ticket;
import com.TicketBooking.Movie.Ticket.Booking.Models.User;
import com.TicketBooking.Movie.Ticket.Booking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepositoryDaoImpl extends CommonRepoImpl implements UserRepository {


    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<Ticket> getTicketHistory(String userId) {
        Query query= new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        return mongoTemplate.find(query,Ticket.class);

    }

}
