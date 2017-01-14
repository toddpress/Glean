package com.glean.repository;

import com.glean.entities.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by justi on 1/8/2017.
 */
public interface UserProfileRepo extends MongoRepository<UserProfile, String>{

    public UserProfile findByUserId(String id);
    public UserProfile findByUserName(String userName);

}
