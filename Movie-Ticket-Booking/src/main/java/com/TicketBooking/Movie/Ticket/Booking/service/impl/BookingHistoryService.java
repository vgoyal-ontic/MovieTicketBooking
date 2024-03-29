package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.BookingHistory;

import com.TicketBooking.Movie.Ticket.Booking.repository.impl.BookingRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
@Service
public class BookingHistoryService  implements CrudService<BookingHistory> {

    @Autowired
    private BookingRepositoryDaoImpl bookingRepositoryDao;
    @Override
    public List<BookingHistory> findAll() {
        return bookingRepositoryDao.findAll();
    }

    @Override
    public BookingHistory findById(String id) {
        return bookingRepositoryDao.findById(id);
    }

    @Override
    public void deleteById(String id) {
        bookingRepositoryDao.deleteById(id);

    }

    @Override
    public void save(BookingHistory ob) {
        bookingRepositoryDao.save(ob);

    }

    public List<BookingHistory> getUserHistory(String userId){
        return bookingRepositoryDao.getUserHistory(userId);

    }

}
