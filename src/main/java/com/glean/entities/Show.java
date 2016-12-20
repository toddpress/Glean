package com.glean.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by michaelplott on 12/17/16.
 */
public class Show{

    @Field(value = "id")
    private String id;

    private String title;

    private List<String> alternate_titles;

    private String status;

    private String type;

    private String container_show;

    private String first_aired;

    private String network;

    private List<Channel> channels;

    private String runtime;

    private List<Genre> genres;

    private List<Tag> tags;

    private List<Actor> cast;

    private String overview;

    private String air_day_of_week;

    private String air_time;

    private String rating;

    private String imdb_id;

    private String tvdb;

    private String themoviedb;

    private String freebase;

    private String tv_com;

    private String metacritic;

    private String common_sense_media;

    private String wikipedia_id;

    private TVRage tvrage;

    private Social social;

    private String fanart;

    private String poster;

    private String banner;

    private String artwork_208x117;

    private String artwork_304x171;

    private String artwork_448x252;

    private String artwork_608x342;

    private String url;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAlternate_titles() {
        return alternate_titles;
    }

    public void setAlternate_titles(List<String> alternate_titles) {
        this.alternate_titles = alternate_titles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContainer_show() {
        return container_show;
    }

    public void setContainer_show(String container_show) {
        this.container_show = container_show;
    }

    public String getFirst_aired() {
        return first_aired;
    }

    public void setFirst_aired(String first_aired) {
        this.first_aired = first_aired;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Actor> getCast() {
        return cast;
    }

    public void setCast(List<Actor> cast) {
        this.cast = cast;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getAir_day_of_week() {
        return air_day_of_week;
    }

    public void setAir_day_of_week(String air_day_of_week) {
        this.air_day_of_week = air_day_of_week;
    }

    public String getAir_time() {
        return air_time;
    }

    public void setAir_time(String air_time) {
        this.air_time = air_time;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getTvdb() {
        return tvdb;
    }

    public void setTvdb(String tvdb) {
        this.tvdb = tvdb;
    }

    public String getThemoviedb() {
        return themoviedb;
    }

    public void setThemoviedb(String themoviedb) {
        this.themoviedb = themoviedb;
    }

    public String getFreebase() {
        return freebase;
    }

    public void setFreebase(String freebase) {
        this.freebase = freebase;
    }

    public String getTv_com() {
        return tv_com;
    }

    public void setTv_com(String tv_com) {
        this.tv_com = tv_com;
    }

    public String getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(String metacritic) {
        this.metacritic = metacritic;
    }

    public String getCommon_sense_media() {
        return common_sense_media;
    }

    public void setCommon_sense_media(String common_sense_media) {
        this.common_sense_media = common_sense_media;
    }

    public String getWikipedia_id() {
        return wikipedia_id;
    }

    public void setWikipedia_id(String wikipedia_id) {
        this.wikipedia_id = wikipedia_id;
    }

    public TVRage getTvrage() {
        return tvrage;
    }

    public void setTvrage(TVRage tvrage) {
        this.tvrage = tvrage;
    }

    public Social getSocial() {
        return social;
    }

    public void setSocial(Social social) {
        this.social = social;
    }

    public String getFanart() {
        return fanart;
    }

    public void setFanart(String fanart) {
        this.fanart = fanart;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getArtwork_208x117() {
        return artwork_208x117;
    }

    public void setArtwork_208x117(String artwork_208x117) {
        this.artwork_208x117 = artwork_208x117;
    }

    public String getArtwork_304x171() {
        return artwork_304x171;
    }

    public void setArtwork_304x171(String artwork_304x171) {
        this.artwork_304x171 = artwork_304x171;
    }

    public String getArtwork_448x252() {
        return artwork_448x252;
    }

    public void setArtwork_448x252(String artwork_448x225) {
        this.artwork_448x252 = artwork_448x225;
    }

    public String getArtwork_608x342() {
        return artwork_608x342;
    }

    public void setArtwork_608x342(String artwork_608x342) {
        this.artwork_608x342 = artwork_608x342;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}