package com.glean.guideBoxAccessLayer;

/**
 * Created by justi on 12/17/2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class GuideBoxAPIAccessor {

    @Autowired
    private URLBuilder urlBuilder;

    @Autowired
    private URLCaller urlCaller;

    public String getShowByShowTitle(String apiKey, String title) throws IOException {
        String url = urlBuilder.buildUrlToGetShowByTitle(apiKey, title);
        return urlCaller.makeCall(url);
    }

    public String getShowByTelevisionDatabaseShowId(String apiKey, String showId) throws IOException{
        String url = urlBuilder.buildUrlToGetShowByTelevisionDatabaseShowId(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    public String getShowByShowId(String apiKey, String showId) throws IOException{
        String url = urlBuilder.buildUrlToGetShowByShowId(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    public String getSeasonsByShowId(String apiKey, String showId) throws IOException{
        String url = urlBuilder.buildUrlToGetSeasonsByShowId(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    public String getEpisodesByShowAndSeasonId(String apiKey, String showId, int seasonNumber, int startingEpisode, int episodeCount, List<String> sources, String platform, boolean includedLinks, boolean chronologicalOrder) throws IOException{
        String url = urlBuilder.buildGetEpisodesByShowAndSeasonIdUrl(apiKey, showId, seasonNumber, startingEpisode, episodeCount, sources, platform, includedLinks, chronologicalOrder);
        return urlCaller.makeCall(url);
    }

    public String getEpisodesByShowAndSeasonId(String apiKey, String showId, int seasonNumber, int startingEpisode, int episodeCount, List<String> sources, String platform, boolean includedLinks) throws IOException{
        return getEpisodesByShowAndSeasonId(apiKey, showId, seasonNumber, startingEpisode, episodeCount, sources, platform, includedLinks, true);
    }

    public String getSimilarShowById(String apiKey, String showId) throws IOException{
        String url = urlBuilder.buildGetSimilarShowByIdUrl(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    public String getFreeSources(String apiKey) throws IOException{
        String url = urlBuilder.buildGetFreeSourcesUrl(apiKey);
        return urlCaller.makeCall(url);
    }

    public String getSubscriptionSources(String apiKey) throws IOException{
        String url = urlBuilder.buildGetSubscriptionSourcesUrl(apiKey);
        return urlCaller.makeCall(url);
    }

    public String getMovieByTheMovieDBShowId(String apiKey, String movieId) throws IOException{
        String url = urlBuilder.buildUrlToGetMovieByTheMovieDBShowId(apiKey, movieId);
        return urlCaller.makeCall(url);
    }

    public String getMovieByMovieId(String apiKey, String movieId) throws IOException{
        String url = urlBuilder.buildUrlToGetMovieByMovieId(apiKey, movieId);
        return urlCaller.makeCall(url);
    }

    public String getMovieByTitle(String apiKey, String movieName) throws IOException{
        String url = urlBuilder.buildUrlToGetMovieByTitle(apiKey, movieName);
        return urlCaller.makeCall(url);
    }

}

