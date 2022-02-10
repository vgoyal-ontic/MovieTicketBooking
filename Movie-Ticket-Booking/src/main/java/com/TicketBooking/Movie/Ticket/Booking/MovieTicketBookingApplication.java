package com.TicketBooking.Movie.Ticket.Booking;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.Models.User;
import com.TicketBooking.Movie.Ticket.Booking.repository.MovieRepository;
import com.TicketBooking.Movie.Ticket.Booking.repository.UserRepository;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MovieTicketBookingApplication  {
    @Autowired
    UserRepository userRepository;
    @Autowired
    MovieRepository movieRepository;


    public static void main(String[] args) {

        SpringApplication.run(MovieTicketBookingApplication.class, args);

//        MongoClientURI uri = new MongoClientURI("mongodb://127.0.0.1:27017");
//        MongoClient mongo = new MongoClient(uri);
//        MongoDatabase bookMyShow= mongo.getDatabase("BookMyShow");

    }


//    @Override
//    public void run(String... args) throws Exception {
//        movieRepository.deleteAll();
////
//        movieRepository.insert( new Movie("Dabangg","1"));
////        for(Movie movie: movieRepository.findAll()){
////            System.out.println(movie.getName());
////        }
//
//
//    }
}
