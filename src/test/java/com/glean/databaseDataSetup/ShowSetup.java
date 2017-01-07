package com.glean.databaseDataSetup;

import com.glean.repository.ShowRepo;
import com.glean.utility.GuideBoxDataAggregator;
import com.mongodb.MongoClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Created by ericweidman on 1/7/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowSetup {

    @Autowired
    private ShowRepo showRepo;

    @Autowired
    private GuideBoxDataAggregator dataAggregator;

    @Value("${spring.data.mongodb.database}")
    String databaseName;

    @Test
    public void getAllShowsFromGuideBoxAndPrepopulate() throws IOException {
//        "613";archer
//        "65";the simpsons
//        "6959";game of thrones
//        "28164";mr. robot
//        "15631";orange is the new black
//        "8523";breaking bad
//        "621";american horror story
//        "13424";sherlock
//        "1737";the friends
//        "16279";rick and morty
//        "13689";star trek the next generation
//        "405";south park
//        "2098";arrested development
        String showId[] = {"613", "65", "6959", "28164", "15631", "8523", "621", "13424", "1737", "1627"};
        MongoTemplate mongoTemplate = new MongoTemplate(new SimpleMongoDbFactory(new MongoClient(), databaseName));
        mongoTemplate.remove(new Query(), "show");

        for (int i = 0; i < showId.length; i++) {
            showRepo.save(dataAggregator.assembleFullShowFromGuideBox(showId[i]));
        }


    }

}
