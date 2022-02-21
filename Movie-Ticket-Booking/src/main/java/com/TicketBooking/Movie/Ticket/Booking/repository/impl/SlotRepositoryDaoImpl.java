package com.TicketBooking.Movie.Ticket.Booking.repository.impl;

import com.TicketBooking.Movie.Ticket.Booking.Models.Slot;

import com.TicketBooking.Movie.Ticket.Booking.config.MongoConfig;
import com.TicketBooking.Movie.Ticket.Booking.enums.SeatType;
import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import com.TicketBooking.Movie.Ticket.Booking.repository.SlotRepository;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public class SlotRepositoryDaoImpl  implements SlotRepository, CommonRepo<Slot> {



    @Autowired
    private MongoTemplate mongoTemplate;


//    public SlotRepositoryDaoImpl(){
//
//        this.mongoTemplate= new MongoTemplate((MongoClient) MongoConfig.mongo,"BookMyShow");
//
//    }
    @Override
    public void save(Slot object) {
        mongoTemplate.save(object);
    }

    @Override
    public Slot findById(String id) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query,Slot.class);
    }

    @Override
    public void deleteById(String id) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.findAndRemove(query,Slot.class);
    }

    @Override
    public List<Slot> findAll() {
        return mongoTemplate.findAll(Slot.class);
    }


    @Override
    public List<Slot> getAllSlotsOfMovieAndTheatre(String theatreId, String movieId){

        Query query = new Query();
        query.addCriteria(Criteria.where("movieId").is(movieId).and("theatreId").is(movieId));

           return mongoTemplate.find(query,Slot.class);
    }
    public Map<SeatType,Integer> getAvailableSeats(String slotId){

        return findById(slotId).getAvailableSeats();

    }

    public String bookTicket(String slotId,SeatType seatType,Integer quantity){
        Slot slot= findById(slotId);


        if(slot.getAvailableSeats().get(seatType )<quantity){
            return "Tickets Not Available";
        }else{
            Map<SeatType,Integer> seats= slot.getAvailableSeats();
            seats.put(seatType,seats.get(seatType)-quantity);
            slot.setAvailableSeats(seats);
            save(slot);
             return "Tickets Booked";
        }


    }


}
