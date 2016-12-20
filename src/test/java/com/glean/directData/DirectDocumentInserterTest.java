package com.glean.directData;

import com.glean.guideBoxAccessLayaer.GuideBoxAPIAccessor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by justi on 12/18/2016.
 */
public class DirectDocumentInserterTest {



    @Test
    public void testRawInsert() throws Exception {
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        String jsonResult = accessor.getShowByShowId("rKb2Votbq91OfF7vWvJtcn9Q18QNAUiQ", "613");
        DirectDocumentInserter inserter = new DirectDocumentInserter();
        inserter.insertJSON(jsonResult, "show");
    }

}
