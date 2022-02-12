package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Ticket;
import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import com.TicketBooking.Movie.Ticket.Booking.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository
public class TicketRepositoryDaoImpl implements TicketRepository, CommonRepo<Ticket> {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Ticket object) {
        mongoTemplate.save(object);

    }

    @Override
    public Ticket findById(String id) {
        return mongoTemplate.findById(id,Ticket.class);
    }

    @Override
    public void deleteById(String id) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.findAndRemove(query,Ticket.class);

    }

    @Override
    public List<Ticket> findAll() {
        return mongoTemplate.findAll(Ticket.class);
    }

    //
//    @Override
//    public List<Ticket> getTicketsFromIds(List<String> ticketIds) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("id").in(ticketIds));
//        return mongoTemplate.find(query,Ticket.class);
//    }


}
