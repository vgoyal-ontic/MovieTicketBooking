package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.Models.TheatreOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class TheatreOwnerDaoImpl {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Theatre> getTheatresOfOwner(String ownerId){

        TheatreOwner owner= mongoTemplate.findById(ownerId,TheatreOwner.class);
        List<String> theatreIds=owner.getTheatres();

        Query query= new Query();
        query.addCriteria(Criteria.where("id").in(theatreIds));
        return mongoTemplate.find(query,Theatre.class);

    }

    public void addTheatre(String ownerId, Theatre theatre){

    }
}
