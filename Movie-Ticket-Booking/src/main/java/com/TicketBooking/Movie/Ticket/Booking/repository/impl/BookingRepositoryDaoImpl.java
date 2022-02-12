package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.BookingHistory;
import com.TicketBooking.Movie.Ticket.Booking.Models.Ticket;
import com.TicketBooking.Movie.Ticket.Booking.Models.User;
import com.TicketBooking.Movie.Ticket.Booking.repository.BookingRepository;
import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookingRepositoryDaoImpl implements BookingRepository, CommonRepo<BookingHistory> {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(BookingHistory object) {
        mongoTemplate.save(object);


    }

    @Override
    public BookingHistory findById(String id) {
        return  mongoTemplate.findById(id,BookingHistory.class);
    }

    @Override
    public void deleteById(String id) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.findAndRemove(query,BookingHistory.class);


    }

    @Override
    public List<BookingHistory> findAll() {
        return mongoTemplate.findAll(BookingHistory.class);
    }

    @Override
    public List<BookingHistory> getHistoryOfUser(String userId){
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        return  mongoTemplate.find(query,BookingHistory.class);

    }


    //    @Override
//    public List<BookingHistory> getAllBookingsInTheatre(String userId, String theatreId)
//    {
//        return  new ArrayList<>(mongoTemplate.findAll(BookingHistory.class)) ;
//    }
//
//
//    @Override
//    public List<BookingHistory> getAllBookingsOfUser(String userId) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("userId").is(userId));
//        return new ArrayList<>(mongoTemplate.find(query, BookingHistory.class));
//
//    }
//

}
