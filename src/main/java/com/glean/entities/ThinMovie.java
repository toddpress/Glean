package com.glean.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by justi on 12/30/2016.
 */
public class ThinMovie {

    @Field(value = "_id")
    @JsonProperty("id")
    private String id;

    private String title;

    @Field(value = "release_date")
    @JsonProperty("release_date")
    private String releaseDate;

    private String rating;

    private String overview;

    @Field(value = "poster_120x171")
    @JsonProperty("poster_120x171")
    private String poster120x171;

    @Field(value = "poster_240x342")
    @JsonProperty("poster_240x342")
    private String poster240x342;

    @Field(value = "poster_400x570")
    @JsonProperty("poster_400x570")
    private String poster400x570;

    private List<Genre> genres;

    private List<Tag> tags;

    private String duration;
        
}
