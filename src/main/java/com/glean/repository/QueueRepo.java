package com.glean.repository;

import com.glean.entities.Queue;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by michaelplott on 1/6/17.
 */
public interface QueueRepo extends MongoRepository<Queue, String> {
    Queue findByUserName(String userName);
    Queue findByUserId(String userId);
}
