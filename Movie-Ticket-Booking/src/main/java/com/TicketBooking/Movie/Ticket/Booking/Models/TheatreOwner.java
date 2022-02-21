package com.TicketBooking.Movie.Ticket.Booking.Models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TheatreOwner {
    @Id
    private String id;



    private String name;
    private String mobileNumber;
    private String emailId;
    private List<String> theatres= new ArrayList<>();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name=name.toLowerCase();
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<String> getTheatres() {
        return theatres;
    }

    public void setTheatres(List<String> theatres) {
        this.theatres = theatres;
    }


}

