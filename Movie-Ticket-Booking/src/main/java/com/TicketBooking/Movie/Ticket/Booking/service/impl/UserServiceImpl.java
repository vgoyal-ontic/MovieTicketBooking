package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.User;

import com.TicketBooking.Movie.Ticket.Booking.repository.impl.UserRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements CrudService<User> {
    @Autowired
    private UserRepositoryDaoImpl userRepositoryDao;
    @Override
    public List<User> findAll() {
        return userRepositoryDao.findAll();
    }

    @Override
    public User findById(String id) {
        return userRepositoryDao.findById(id);
    }

    @Override
    public void deleteById(String id) {
        userRepositoryDao.deleteById(id);
    }

    @Override
    public void save(User ob) {
        userRepositoryDao.save(ob);


    }
}
