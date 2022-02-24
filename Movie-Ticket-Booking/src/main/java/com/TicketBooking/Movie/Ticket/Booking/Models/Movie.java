package com.TicketBooking.Movie.Ticket.Booking.Models;

import com.TicketBooking.Movie.Ticket.Booking.enums.Certificate;
import com.TicketBooking.Movie.Ticket.Booking.enums.Genre;
import com.TicketBooking.Movie.Ticket.Booking.enums.Language;

import lombok.*;

import org.springframework.data.annotation.Id;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private String id;

    private String name;
    private Genre genre;
    private Language language;
    private Certificate certificate;
//
//    @JsonFormat(pattern="dd/MM/yyyy")
//    private Date releaseDate;
//    @JsonFormat(pattern="hh:mm:ss")
//    private LocalTime duration;

    private String summary;
    private float rating;
//
//    public Date getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(Date releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//
//    public LocalTime getDuration() {
//        return duration;
//    }
//
//    public void setDuration(LocalTime duration) {
//        this.duration = duration;
//    }
//


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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {

        this.genre = genre;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public String getSummary() {

        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}

