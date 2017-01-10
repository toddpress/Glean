package com.glean.databaseDataSetup;

import com.glean.entities.User;
import com.glean.entities.UserProfile;
import com.mongodb.MongoClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Created by justi on 1/8/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserProfileSetup {

    @Value("${spring.data.mongodb.database}")
    String databaseName;

    @Test
    public void getAllMoviesFromGuideBoxAndPrepopulate() throws IOException {

        MongoTemplate mongoTemplate = new MongoTemplate(new SimpleMongoDbFactory(new MongoClient(), databaseName));
        mongoTemplate.remove(new Query(), "userprofile");

        User user = new User();
        user.setUserName("Milo");

        UserProfile userProfile = new UserProfile();
        userProfile.setUser(user);

        //Here we can set available shows by converting Shows into ThinShows using BeanUtils

        //Here we can set available movie by converting Movies into ThinMovies using BeanUtils


    }

}
