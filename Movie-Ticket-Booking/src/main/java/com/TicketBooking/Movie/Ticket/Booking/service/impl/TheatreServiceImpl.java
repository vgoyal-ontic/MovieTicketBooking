package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.TheatreRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
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

        return theatreRepositoryDao.getTheatresInCity(city);

    }


    public List<Theatre> getTheatreOfChain(String theatreType) {

        return theatreRepositoryDao.getTheatreOfChain(theatreType);
    }

    public List<Theatre> getTheatreOfCityAndChain(String theatreType,String city){
        return theatreRepositoryDao.getTheatreOfCityAndChain(theatreType,city);


    }
//    public List<Movie> getAllMovies(String theatreId){
//        return theatreRepositoryDao.getAllMovies(theatreId);
//
//    }


}
