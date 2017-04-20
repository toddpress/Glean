package com.glean.filter;

import com.glean.entities.Show;
import com.glean.entities.UserStreamSource;
import com.glean.repository.ShowRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by justi on 4/19/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowFilterTest {

    @Autowired
    private ShowRepo showRepo;

    @Test
    public void testFilterShowEpisodesAndSourcesBasedOnUserStreamSources() throws Exception {
        Show show = showRepo.findById("613");
        List<UserStreamSource> streamSources = new ArrayList<>();
        UserStreamSource userStreamSource = new UserStreamSource();
        userStreamSource.setSource("netflix");
        streamSources.add(userStreamSource);
        ShowFilter.getInstance().filterShowSeasonsAndEpisodesBasedOnUserStreamSources(show, streamSources);
    }

}