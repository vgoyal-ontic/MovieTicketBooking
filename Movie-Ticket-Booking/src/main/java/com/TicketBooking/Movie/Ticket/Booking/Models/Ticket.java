package com.TicketBooking.Movie.Ticket.Booking.Models;

import com.TicketBooking.Movie.Ticket.Booking.enums.SeatType;
import com.TicketBooking.Movie.Ticket.Booking.repository.TicketRepository;
import com.TicketBooking.Movie.Ticket.Booking.repository.UserRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    private SeatType seatType;
    private  String id;
    private String theatreID;
    private String movieID;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date date;
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTheatreID() {
        return theatreID;
    }

    public void setTheatreID(String theatreID) {
        this.theatreID = theatreID;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
