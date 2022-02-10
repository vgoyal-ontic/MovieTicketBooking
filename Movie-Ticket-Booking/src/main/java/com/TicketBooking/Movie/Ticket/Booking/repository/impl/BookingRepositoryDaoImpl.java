package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.BookingHistory;
import com.TicketBooking.Movie.Ticket.Booking.Models.Ticket;
import com.TicketBooking.Movie.Ticket.Booking.Models.User;
import com.TicketBooking.Movie.Ticket.Booking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookingRepositoryDaoImpl implements BookingRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<BookingHistory> getAllBookingsInTheatre(String userId, String theatreId)
    {
        return  new ArrayList<>(mongoTemplate.findAll(BookingHistory.class)) ;
    }


    @Override
    public List<BookingHistory> getAllBookingsOfUser(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        return new ArrayList<>(mongoTemplate.find(query, BookingHistory.class));

    }


}
