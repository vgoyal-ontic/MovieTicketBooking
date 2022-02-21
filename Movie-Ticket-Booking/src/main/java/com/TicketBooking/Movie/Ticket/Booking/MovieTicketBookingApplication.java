package com.TicketBooking.Movie.Ticket.Booking;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.UserRepositoryDaoImpl;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class MovieTicketBookingApplication implements  CommandLineRunner  {


    public static void main(String[] args) {

        SpringApplication.run(MovieTicketBookingApplication.class, args);




//






    }

    @Override
    public void run(String... args) throws Exception {


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
