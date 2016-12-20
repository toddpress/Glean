package com.glean.entities;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by justi on 12/19/2016.
 */
public class Actor {

    @Field(value = "id")
    private String id;

    private String name;

    private String character_name;

}
