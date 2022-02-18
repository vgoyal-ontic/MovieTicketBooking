package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.config.MongoConfig;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TheatreOwnerDaoImpl {

    @Autowired
    private MongoTemplate mongoTemplate;
//
//    public TheatreOwnerDaoImpl(){
//
//        this.mongoTemplate= new MongoTemplate((MongoClient) MongoConfig.mongo,"BookMyShow");
//
//    }



    public void createTheatre(){
    }







    public void addTheatre(String ownerId, Theatre theatre){

    }
}
