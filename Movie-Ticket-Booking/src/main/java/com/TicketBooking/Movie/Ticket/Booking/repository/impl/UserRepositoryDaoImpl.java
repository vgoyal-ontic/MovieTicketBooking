package com.TicketBooking.Movie.Ticket.Booking.repository.impl;
import com.TicketBooking.Movie.Ticket.Booking.Models.User;
import com.TicketBooking.Movie.Ticket.Booking.repository.CommonRepo;
import com.TicketBooking.Movie.Ticket.Booking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import java.util.List;



@Component
public class UserRepositoryDaoImpl implements UserRepository, CommonRepo<User> {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void save(User object)
    {
        mongoTemplate.save(object);
    }

    @Override
    public User findById(String id) {

        return mongoTemplate.findById(id,User.class);
    }

    @Override
    public void deleteById(String id) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.findAndRemove(query,User.class);

    }

    @Override
    public List<User> findAll() {
        return mongoTemplate.findAll(User.class);
    }




//
//
//    @Override
//    public List<Ticket> getTicketHistory(String userId) {
//        Query query= new Query();
//        query.addCriteria(Criteria.where("userId").is(userId));
//        return mongoTemplate.find(query,Ticket.class);
//
//    }
//
//    @Override
//    public <T> void save(T object) {
//        commonRepoImpl.save(object);
//
//    }
//
//    @Override
//    public <T> T findById(String id, Class<T> entityClass) {
//        return commonRepoImpl.findById(id,entityClass);
//    }
//
//    @Override
//    public <T> void deleteById(String id, Class<T> entityClass) {
//        commonRepoImpl.deleteById(id,entityClass);
//
//
//
//    }
//
//    @Override
//    public <T> List<T> findAll(Class<T> entityClass) {
//        return commonRepoImpl.findAll(entityClass);
//
//    }
}
