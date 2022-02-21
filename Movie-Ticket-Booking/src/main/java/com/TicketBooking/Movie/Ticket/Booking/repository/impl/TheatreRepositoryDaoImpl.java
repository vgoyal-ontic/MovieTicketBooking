package com.TicketBooking.Movie.Ticket.Booking.repository.impl;
import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.enums.TheatreChain;
import com.TicketBooking.Movie.Ticket.Booking.enums.TheatreType;
import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import com.TicketBooking.Movie.Ticket.Booking.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TheatreRepositoryDaoImpl implements TheatreRepository, CommonRepo<Theatre> {

    @Autowired
    private MongoTemplate mongoTemplate;

    //    public TheatreRepositoryDaoImpl(){
//        this.mongoTemplate= new MongoTemplate((MongoClient) MongoConfig.mongo,"BookMyShow");
//
//    }
    @Override
    public void save(Theatre object) {
        mongoTemplate.save(object);
    }

    @Override
    public Theatre findById(String id) {

        return mongoTemplate.findById(id, Theatre.class);
    }

    @Override
    public void deleteById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.findAndRemove(query, Theatre.class);

    }

    @Override
    public List<Theatre> findAll() {
        return mongoTemplate.findAll(Theatre.class);
    }

    @Override
    public List<Theatre> getTheatresInCity(String city) {
        Query query = new Query();
        query.addCriteria(Criteria.where("city").is(city));
        return mongoTemplate.find(query, Theatre.class);
    }

    @Override
    public List<Theatre> getTheatreType(TheatreType theatreType) {

        Query query = new Query();
        query.addCriteria(Criteria.where("theatreType").is(theatreType));
        return mongoTemplate.find(query, Theatre.class);

    }

    @Override
    public List<Theatre> getTheatreOfCityAndChain(TheatreType theatreType, String city) {
        Query query = new Query();
        query.addCriteria(Criteria.where("theatreType").is(theatreType));
        query.addCriteria(Criteria.where("city").is(city));
        return mongoTemplate.find(query, Theatre.class);

    }

    public List<Theatre> getTheatresOfOwner(String ownerId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("ownerId").is(ownerId));
        return mongoTemplate.find(query, Theatre.class);

    }
    public List<Theatre> getTheatresOfChain(TheatreChain chain){
        Query query= new Query();
        query.addCriteria(Criteria.where("theatreChain").is(chain));
        return mongoTemplate.find(query,Theatre.class);
    }


//    public List<Movie> getAllMovies(String theatreId) {
//
//        Theatre theatre= mongoTemplate.findById(theatreId,Theatre.class);
//        List<String> movieIds=theatre.getMovieIds();
//        Query query= new Query();
//        query.addCriteria(Criteria.where("id").in(movieIds));
//        return mongoTemplate.find(query,Movie.class);
//
//
//
//    }
}