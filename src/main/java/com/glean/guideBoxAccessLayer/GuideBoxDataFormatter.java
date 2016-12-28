package com.glean.guideBoxAccessLayer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.glean.entities.*;
import com.glean.repository.ShowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by justi on 12/25/2016.
 */
@Service
public class GuideBoxDataFormatter {

    @Autowired
    private ShowRepo showRepo;

    @Value("${spring.datasource.url}")
    String dataSource;

    @Value("${apikey}")
    String apiKey;

    public void assembleFullShowFromGuideBox(String showId) throws IOException {
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        ObjectMapper mapper = new ObjectMapper();
        List<String> sources = new ArrayList<String>();
        sources.add("all");
        Show show = mapper.readValue(accessor.getShowByShowId(apiKey, showId), Show.class);
        SeasonsWrapper seasonsWrapper = mapper.readValue(accessor.getSeasonsByShowId(apiKey, showId), SeasonsWrapper.class);
        for(Season season : seasonsWrapper.getResults()) {
            EpisodesWrapper episodesWrapper = mapper.readValue(accessor.getEpisodesByShowAndSeasonId(
                    apiKey,
                    showId,
                    season.getSeasonNumber(),
                    0,
                    100,
                    sources,
                    "web",
                    true),
                    EpisodesWrapper.class);
            System.out.println(episodesWrapper.getResults());
            season.setEpisodes(episodesWrapper.getResults());
            show.addSeason(season);
        }
        showRepo.save(show);
    }

}
