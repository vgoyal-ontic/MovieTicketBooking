package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Ticket;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.TicketRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;

import java.util.List;

public class TicketServiceImpl implements CrudService<Ticket> {
    private TicketRepositoryDaoImpl ticketRepositoryDao;


    @Override
    public List<Ticket> findAll() {
        return ticketRepositoryDao.findAll();
    }

    @Override
    public Ticket findById(String id) {
        return ticketRepositoryDao.findById(id);
    }

    @Override
    public void deleteById(String id) {
        ticketRepositoryDao.deleteById(id);

    }

    @Override
    public void save(Ticket ob) {
        ticketRepositoryDao.save(ob);

    }
}
