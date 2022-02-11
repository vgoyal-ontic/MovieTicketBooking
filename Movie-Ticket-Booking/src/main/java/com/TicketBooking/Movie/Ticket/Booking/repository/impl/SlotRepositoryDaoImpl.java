package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Slot;

import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import com.TicketBooking.Movie.Ticket.Booking.repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class SlotRepositoryDaoImpl  implements SlotRepository, CommonRepo<Slot> {



    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void save(Slot object) {
        mongoTemplate.save(object);
    }

    @Override
    public Slot findById(String id) {
        return mongoTemplate.findById(id,Slot.class);
    }

    @Override
    public void deleteById(String id) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.findAndRemove(query,Slot.class);


    }

    @Override
    public List<Slot> findAll() {
        return mongoTemplate.findAll(Slot.class);
    }


//
//    @Override
//    public Slot getAvailableTickets(String slotId) {
//        Query query= new Query();
//        query.addCriteria(Criteria.where("id").is(slotId));
//
//        return (Slot) mongoTemplate.find(query,Slot.class);
//
//    }
//
//    @Override
//    public List<Slot> getAllSlotsOfMovieInCity(String cityName, String movieId) {
//        Query query= new Query();
//        query.addCriteria(Criteria.where("movieId").is(movieId));
//        // select city now for theatre
//
//        return mongoTemplate.find(query,Slot.class) ;
//
//
//    }
//
//    @Override
//    public List<Slot> getAvailableSlotsOfMovieInCity(String cityName, String movieId) {
//
//        return null;
//
//    }
//
//    @Override
//    public List<Slot> getAllSlotsOfMovieInTheatre(String theatreId, String movieId) {
//        Query query= new Query();
//        query.addCriteria(Criteria.where("movieId").is(movieId));
//        query.addCriteria(Criteria.where("theatreId").is(theatreId));
//
//        // select city now for theatre
//
//        return mongoTemplate.find(query,Slot.class) ;
//
//    }
//
//    @Override
//    public <T> void save(T object) {
//        commonRepoImpl.save(object);
//
//    }
//
//    @Override
//    public <T> T findById(String id, Class<T> entityClass) {
//        return commonRepoImpl.findById(id,entityClass);
//    }
//
//    @Override
//    public <T> void deleteById(String id, Class<T> entityClass) {
//        commonRepoImpl.deleteById(id,entityClass);
//    }
//
//    @Override
//    public <T> List<T> findAll(Class<T> entityClass) {
//        return null;
//    }
}
