package com.TicketBooking.Movie.Ticket.Booking.Models;

import com.TicketBooking.Movie.Ticket.Booking.enums.Certificate;
import com.TicketBooking.Movie.Ticket.Booking.enums.Genre;
import com.TicketBooking.Movie.Ticket.Booking.enums.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.data.annotation.Id;

import java.time.LocalTime;
import java.util.Date;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private String id;

    private String name;
    private Genre genre;
    private Language language;
    private Certificate certificate;
    private Date releaseDate;
    private String summary;
    private LocalTime duration;
    private float rating;




}

