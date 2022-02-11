package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Slot;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.SlotRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SlotServiceImpl  implements CrudService<Slot> {
    @Autowired
    private SlotRepositoryDaoImpl slotRepositoryDao;


    @Override
    public List<Slot> findAll() {
        return slotRepositoryDao.findAll();
    }

    @Override
    public Slot findById(String id) {
        return slotRepositoryDao.findById(id);
    }

    @Override
    public void deleteById(String id) {
        slotRepositoryDao.deleteById(id);
    }

    @Override
    public void save(Slot ob) {

        slotRepositoryDao.save(ob);

    }
}
