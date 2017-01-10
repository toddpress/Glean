package com.glean.repository;

import com.glean.entities.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by justi on 1/8/2017.
 */
public interface UserProfileRepo extends MongoRepository<UserProfile, String>{

    public UserProfile findById(String id);
    public List<UserProfile> findByUserName(String userName);

}
