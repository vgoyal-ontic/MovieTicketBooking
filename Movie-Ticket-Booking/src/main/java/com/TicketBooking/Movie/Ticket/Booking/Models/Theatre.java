package com.TicketBooking.Movie.Ticket.Booking.Models;
import com.TicketBooking.Movie.Ticket.Booking.enums.TheatreChain;
import com.TicketBooking.Movie.Ticket.Booking.enums.TheatreType;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Theatre {
    @Id
    private String  id;

    private String ownerId;

    private TheatreType theatreType;
    private String name;
    private TheatreChain theatreChain;
    private List<Slot> slots;
    private String city;
    private List<String> movieIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public TheatreType getTheatreType() {
        return theatreType;
    }

    public void setTheatreType(TheatreType theatreType) {
        this.theatreType = theatreType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name=name.toLowerCase();
        this.name = name;
    }

    public TheatreChain getTheatreChain() {
        return theatreChain;
    }

    public void setTheatreChain(TheatreChain theatreChain) {
        this.theatreChain = theatreChain;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        city=city.toLowerCase();
        this.city = city;
    }

    public List<String> getMovieIds() {
        return movieIds;
    }

    public void setMovieIds(List<String> movieIds) {
        this.movieIds = movieIds;
    }
}
