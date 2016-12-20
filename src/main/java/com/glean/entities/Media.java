package com.glean.entities;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by michaelplott on 12/17/16.
 */
public abstract class Media {

    @Field(value = "id")
    private String id;

    private String title;

    private String duration;

    private String imdb_id;

    private String original_title;

    private String overview;
}
