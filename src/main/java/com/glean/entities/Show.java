package com.glean.entities;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by michaelplott on 12/17/16.
 */
public class Show{

    @Id
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

    private String artwork_400x225;

    private String artwork_608x342;

    private String url;

}