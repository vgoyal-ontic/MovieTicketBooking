package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Movie;
import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.TheatreRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
}
