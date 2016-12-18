package com.glean.guideBoxAccessLayaer;

/**
 * Created by justi on 12/17/2016.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by justin on 11/1/2016.
 */
public class
GuideBoxAPIAccessorTest {

    private final String API_KEY = "rKb2Votbq91OfF7vWvJtcn9Q18QNAUiQ";
    private Logger logger = null;

    @Before
    public void init() {
        logger = LogManager.getLogger(this.getClass().toString());
    }

    @Test
    public void testSearchForShowByShowTitle() throws Exception {
        logger.info("Searching For Show By Title: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getShowByShowTitle(API_KEY, "orange is the new black");
        logger.info(jsonResult);
    }

    @Test
    public void testGetShowByTelevisionDatabaseShowId() throws Exception {
        logger.info("Getting Show By Television Database ID: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getShowByTelevisionDatabaseShowId(API_KEY, "110381");
        logger.info(jsonResult);
    }

    @Test
    public void testGetShowByShowId() throws Exception {
        logger.info("Getting Show By ID: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getShowByShowId(API_KEY, "613");
        logger.info(jsonResult);
    }

    @Test
    public void testGetSeasonsByShowId() throws Exception {
        logger.info("Getting Seasons By Show ID: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getSeasonsByShowId(API_KEY, "613");
        logger.info(jsonResult);
    }


    @Test
    public void getEpisodesBoyShowAndSeasonId() throws Exception {
        logger.info("Getting Episodes By Show and Season ID: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        List<String> sources = new ArrayList<String>();
        sources.add("netflix");
//        sources.add("free");
        String jsonResult = accessor.getEpisodesByShowAndSeasonId(API_KEY , "613", 1, 0, 10, sources, "web", false);
        logger.info(jsonResult);
    }

    @Test
    public void getSimilarShowById() throws Exception {
        logger.info("Getting Similar Show By ID: ");
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getSimilarShowById(API_KEY, "613");
        logger.info(jsonResult);
    }

}