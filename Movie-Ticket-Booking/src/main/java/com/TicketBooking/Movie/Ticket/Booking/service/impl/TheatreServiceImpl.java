package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.enums.TheatreChain;
import com.TicketBooking.Movie.Ticket.Booking.enums.TheatreType;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.TheatreRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
import org.springframework.beans.CachedIntrospectionResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class TheatreServiceImpl implements CrudService<Theatre> {
    @Autowired
    private TheatreRepositoryDaoImpl theatreRepositoryDao;


    @Override
    public List<Theatre> findAll() {
        return theatreRepositoryDao.findAll();
    }

    @Override
    public Theatre findById(String id) {
        return theatreRepositoryDao.findById(id);
    }

    @Override
    public void deleteById(String id) {
        theatreRepositoryDao.deleteById(id);

    }

    @Override
    public void save(Theatre ob) {
        theatreRepositoryDao.save(ob);

    }
    public List<Theatre> getTheatresInCity(String city) {
        city=city.toLowerCase();
        return theatreRepositoryDao.getTheatresInCity(city.toLowerCase());

    }


    public List<Theatre> getTheatreType(String theatreType) {
        theatreType=theatreType.toUpperCase();
        return theatreRepositoryDao.getTheatreType(TheatreType.valueOf(theatreType));
    }

    public List<Theatre> getTheatreOfCityAndChain(String theatreType,String city){

        return theatreRepositoryDao.getTheatreOfCityAndChain(TheatreType.valueOf(theatreType),city.toLowerCase());

    }

    public List<Theatre> getTheatresOfChain(String theatreChain){
        TheatreChain chain =TheatreChain.valueOf(theatreChain.toUpperCase());
        return theatreRepositoryDao.getTheatresOfChain(chain);
    }



//    public List<Movie> getAllMovies(String theatreId){
//        return theatreRepositoryDao.getAllMovies(theatreId);
//
//    }


}
