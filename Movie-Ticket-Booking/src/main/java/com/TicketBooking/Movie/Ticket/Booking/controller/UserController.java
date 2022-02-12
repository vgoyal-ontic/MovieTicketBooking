package com.TicketBooking.Movie.Ticket.Booking.controller;

import com.TicketBooking.Movie.Ticket.Booking.Models.User;
import com.TicketBooking.Movie.Ticket.Booking.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/users")
public class UserController implements CrudController<User> {
    @Autowired
    private UserServiceImpl userService;


    @GetMapping
    @Override
    public List<User> findAll() {
        return userService.findAll();
    }
    @GetMapping("/{id}")
    @Override
    public User findById(String id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteById(String id) {
        userService.deleteById(id);

    }

    @Override
    public void save(@RequestBody User ob) {
        userService.save(ob);
    }
}
