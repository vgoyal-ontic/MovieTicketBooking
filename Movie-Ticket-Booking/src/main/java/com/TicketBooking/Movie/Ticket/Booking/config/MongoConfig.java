package com.TicketBooking.Movie.Ticket.Booking.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
@Component
public class MongoConfig extends MongoTemplate {

//error

        public MongoConfig() {
                super(MongoClients.create(),"BookMyShow");
        }
}