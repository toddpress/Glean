package com.glean.directData;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.glean.entities.Show;
import com.glean.guideBoxAccessLayaer.GuideBoxAPIAccessor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by justi on 12/18/2016.
 */
public class DirectDocumentInserterTest {

    private final String API_KEY = "rKb2Votbq91OfF7vWvJtcn9Q18QNAUiQ";


    @Test
    public void testRawInsert() throws Exception {
        String showId = "613";
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        StringBuilder showBuilder = new StringBuilder();
        StringBuilder seasonBuilder = new StringBuilder();
        //Get the show json payload into the builder
        showBuilder.append(accessor.getShowByShowId(API_KEY, showId));

        //Now get all the seasons
        seasonBuilder.append(accessor.getSeasonsByShowId(API_KEY, showId));


        DirectDocumentInserter inserter = new DirectDocumentInserter();
//        inserter.insertJSON(jsonResult, "show");

    }

    @Test
    public void jsonToObjectThenCommitToDB() throws IOException {
        String showId = "613";
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Show show = mapper.readValue(accessor.getShowByShowId(API_KEY, showId), Show.class);
        System.out.println(show.getTitle());
    }

    @Test
    public void testGetShowByShowId() throws Exception {
        System.out.println("Getting Show By ID: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getShowByShowId(API_KEY, "613");
        System.out.println(jsonResult);
    }

    @Test
    public void testGetSeasonsByShowId() throws Exception {
        System.out.println("Getting Seasons By Show ID: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getSeasonsByShowId(API_KEY, "613");
        System.out.println(jsonResult);
    }


    @Test
    public void getEpisodesBoyShowAndSeasonId() throws Exception {
        System.out.println("Getting Episodes By Show and Season ID: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        List<String> sources = new ArrayList<String>();
        sources.add("netflix");
//        sources.add("free");
        String jsonResult = accessor.getEpisodesByShowAndSeasonId(API_KEY , "613", 1, 0, 10, sources, "web", false);
        System.out.println(jsonResult);
    }

}
