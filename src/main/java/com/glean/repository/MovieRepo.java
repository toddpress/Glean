package com.glean.repository;

import com.glean.entities.Movie;
import com.glean.entities.Show;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by justi on 12/19/2016.
 */
public interface MovieRepo extends MongoRepository<Movie, String> {

    public Movie findById(String id);
    public List<Show> findByTitle(String title);


}
