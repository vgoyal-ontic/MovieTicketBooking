package com.TicketBooking.Movie.Ticket.Booking.controller;
import com.TicketBooking.Movie.Ticket.Booking.Models.User;
import com.TicketBooking.Movie.Ticket.Booking.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
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
    public User findById(@PathVariable String id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteById(@PathVariable String id) {
        userService.deleteById(id);

    }
    @PostMapping
    @Override
    public void save(@RequestBody User ob) {
        userService.save(ob);
    }


}
