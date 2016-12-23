package com.glean.services;

import com.glean.entities.Show;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by justi on 12/19/2016.
 */
public interface ShowRepo extends MongoRepository<Show, String> {

    public Show findById(String id);
    public List<Show> findByTitle(String title);


}
