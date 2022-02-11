package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Slot;
import com.TicketBooking.Movie.Ticket.Booking.enums.SeatType;
import com.TicketBooking.Movie.Ticket.Booking.repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Repository
public class SlotRepositoryDaoImpl extends CommonRepoImpl implements SlotRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Slot getAvailableTickets(String slotId) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(slotId));

        return (Slot) mongoTemplate.find(query,Slot.class);

    }

    @Override
    public List<Slot> getAllSlotsOfMovieInCity(String cityName, String movieId) {
        Query query= new Query();
        query.addCriteria(Criteria.where("movieId").is(movieId));
        // select city now for theatre

        return mongoTemplate.find(query,Slot.class) ;


    }

    @Override
    public List<Slot> getAvailableSlotsOfMovieInCity(String cityName, String movieId) {

        return null;

    }

    @Override
    public List<Slot> getAllSlotsOfMovieInTheatre(String theatreId, String movieId) {
        Query query= new Query();
        query.addCriteria(Criteria.where("movieId").is(movieId));
        query.addCriteria(Criteria.where("theatreId").is(theatreId));

        // select city now for theatre

        return mongoTemplate.find(query,Slot.class) ;

    }
}
