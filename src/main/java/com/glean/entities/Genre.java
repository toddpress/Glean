package com.glean.entities;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by michaelplott on 12/17/16.
 */
public class Genre {

    @Field(value = "id")
    private String id;

    private String title;

}
