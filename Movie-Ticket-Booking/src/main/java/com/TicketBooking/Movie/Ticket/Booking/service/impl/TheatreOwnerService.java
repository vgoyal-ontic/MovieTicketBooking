package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Theatre;
import com.TicketBooking.Movie.Ticket.Booking.Models.TheatreOwner;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.TheatreOwnerDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TheatreOwnerService {
    @Autowired
    TheatreOwnerDaoImpl theatreOwnerDao;

    public List<Theatre> getTheatresOfOwner(String ownerId){
        return theatreOwnerDao.getTheatresOfOwner(ownerId);
    }


}
