package com.glean.entities;

import com.glean.guideBoxAccessLayaer.GuideBoxAPIAccessor;
import com.glean.services.ShowRepo;
import com.mongodb.util.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

/**
 * Created by justi on 12/19/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowEntityTest {

    @Autowired
    ShowRepo showRepo;

    @Test
    public void setsIdOnSave() {

        List<Show> shows = showRepo.findByTitle("Archer");
        for(Show show: shows){
            System.out.println(show.getTitle());
        }

    }


    @Test
    public void createMongoEntityFromJsonPayload() {
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = null;
        try {
            jsonResult = accessor.getShowByShowId("rKb2Votbq91OfF7vWvJtcn9Q18QNAUiQ", "613");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Show show = (Show) JSON.parse(jsonResult);

    }

}
