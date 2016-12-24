package com.glean.guideBoxAccessLayer;

/**
 * Created by justi on 12/17/2016.
 */

import java.io.IOException;
import java.util.List;

/**
 * Created by justin on 10/31/2016.
 */
public class GuideBoxAPIAccessor {

    public String getShowByShowTitle(String apiKey, String title) throws IOException {
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildUrlToGetShowByTitle(apiKey, title);
        return urlCaller.makeCall(url);
    }

    public String getShowByTelevisionDatabaseShowId(String apiKey, String showId) throws IOException{
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildUrlToGetShowByTelevisionDatabaseShowId(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    public String getShowByShowId(String apiKey, String showId) throws IOException{
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildUrlToGetShowByShowId(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    public String getSeasonsByShowId(String apiKey, String showId) throws IOException{
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildUrlToGetSeasonsByShowId(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    public String getEpisodesByShowAndSeasonId(String apiKey, String showId, int seasonNumber, int startingEpisode, int episodeCount, List<String> sources, String platform, boolean includedLinks, boolean chronologicalOrder) throws IOException{
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildGetEpisodesByShowAndSeasonIdUrl(apiKey, showId, seasonNumber, startingEpisode, episodeCount, sources, platform, includedLinks, chronologicalOrder);
        return urlCaller.makeCall(url);
    }

    public String getEpisodesByShowAndSeasonId(String apiKey, String showId, int seasonNumber, int startingEpisode, int episodeCount, List<String> sources, String platform, boolean includedLinks) throws IOException{
        return getEpisodesByShowAndSeasonId(apiKey, showId, seasonNumber, startingEpisode, episodeCount, sources, platform, includedLinks, true);
    }

    public String getSimilarShowById(String apiKey, String showId) throws IOException{
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildGetSimilarShowByIdUrl(apiKey, showId);
        System.out.println(url);
        return urlCaller.makeCall(url);
    }

    public String getFreeSources(String apiKey) throws IOException{
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildGetFreeSourcesUrl(apiKey);
        System.out.println(url);
        return urlCaller.makeCall(url);
    }

    public String getSubscriptionSources(String apiKey) throws IOException{
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildGetSubscriptionSourcesUrl(apiKey);
        return urlCaller.makeCall(url);
    }

    public String getMovieByTheMovieDBShowId(String apiKey, String movieId) throws IOException{
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildUrlToGetMovieByTheMovieDBShowId(apiKey, movieId);
        return urlCaller.makeCall(url);
    }

    public String getMovieByMovieId(String apiKey, String movieId) throws IOException{
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildUrlToGetMovieByMovieId(apiKey, movieId);
        return urlCaller.makeCall(url);
    }

    public String getMovieByTitle(String apiKey, String movieName) throws IOException{
        URLBuilder urlBuilder = new URLBuilder();
        URLCaller urlCaller = new URLCaller();
        String url = urlBuilder.buildUrlToGetMovieByTitle(apiKey, movieName);
        return urlCaller.makeCall(url);
    }

}

