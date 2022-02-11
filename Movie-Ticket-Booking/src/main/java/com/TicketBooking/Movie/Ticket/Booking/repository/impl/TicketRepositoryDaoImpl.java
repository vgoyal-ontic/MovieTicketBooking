package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Ticket;
import com.TicketBooking.Movie.Ticket.Booking.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TicketRepositoryDaoImpl extends CommonRepoImpl implements TicketRepository {
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public List<Ticket> getTicketsFromIds(List<String> ticketIds) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").in(ticketIds));
        return mongoTemplate.find(query,Ticket.class);
    }


}
