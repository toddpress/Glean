package com.glean.guideBoxAccessLayaer;

/**
 * Created by justi on 12/17/2016.
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by justin on 11/1/2016.
 */
public class
GuideBoxAPIAccessorTest {

    private final String API_KEY = "rKb2Votbq91OfF7vWvJtcn9Q18QNAUiQ";


    @Test
    public void testSearchForShowByShowTitle() throws Exception {
        System.out.println("Searching For Show By Title: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getShowByShowTitle(API_KEY, "orange is the new black");
        System.out.println(jsonResult);
    }

    @Test
    public void testGetShowByTelevisionDatabaseShowId() throws Exception {
        System.out.println("Getting Show By Television Database ID: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getShowByTelevisionDatabaseShowId(API_KEY, "110381");
        System.out.println(jsonResult);
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

    @Test
    public void getSimilarShowById() throws Exception {
        System.out.println("Getting Similar Show By ID: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getSimilarShowById(API_KEY, "613");
        System.out.println(jsonResult);
    }

    // TODO: 12/23/2016 fix this broken test: not sure what is wrong with the url format by guidebox doesn't recognize the format
    @Test
    public void getFreeSources() throws Exception {
        System.out.println("Getting Free Sources");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getFreeSources(API_KEY);
        System.out.println(jsonResult);
    }

    // TODO: 12/23/2016 fix this broken test: not sure what is wrong with the url format by guidebox doesn't recognize the format
    @Test
    public void getSubscriptionSources() throws Exception {
        System.out.println("Getting Subscription Sources");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getSubscriptionSources(API_KEY);
        System.out.println(jsonResult);
    }

}