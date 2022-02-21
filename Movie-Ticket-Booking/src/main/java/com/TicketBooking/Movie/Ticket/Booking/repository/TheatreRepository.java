package com.TicketBooking.Movie.Ticket.Booking.repository;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.enums.TheatreType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TheatreRepository {

    List<Theatre> getTheatresInCity(String city);
//    List<Theatre> getTopRatedTheatresInCity(String cityName);

    List<Theatre> getTheatreType(TheatreType name);
    List<Theatre> getTheatreOfCityAndChain(TheatreType theatreType,String city);




}
