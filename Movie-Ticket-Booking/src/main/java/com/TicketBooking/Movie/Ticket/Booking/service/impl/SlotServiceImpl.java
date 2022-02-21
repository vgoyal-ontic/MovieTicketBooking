package com.TicketBooking.Movie.Ticket.Booking.service.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Slot;
import com.TicketBooking.Movie.Ticket.Booking.enums.SeatType;
import com.TicketBooking.Movie.Ticket.Booking.repository.impl.SlotRepositoryDaoImpl;
import com.TicketBooking.Movie.Ticket.Booking.service.CrudService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
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

    public List<Slot> getAllSlotsOfMovieAndTheatre(String theatreId,String movieId){
        return slotRepositoryDao.getAllSlotsOfMovieAndTheatre(theatreId,movieId);

    }
    public String getAvailableSeats(String slotId){
        Map<SeatType,Integer> temp= slotRepositoryDao.getAvailableSeats(slotId);
        Gson gson = new Gson();
        String json = gson.toJson(temp);
        return json;


    }
    public  String bookTicket(String slotId,String seatType,String quantity){
        SeatType st= SeatType.valueOf(seatType.toUpperCase());
        Integer qty= Integer.valueOf(quantity);
        return slotRepositoryDao.bookTicket(slotId,st ,qty );
    }


}
