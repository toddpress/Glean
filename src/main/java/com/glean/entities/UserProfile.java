package com.glean.entities;

import java.util.List;

/**
 * Created by justi on 12/30/2016.
 */
public class UserProfile {

    private String id;

    private String userName;

    private List<Source> sources;

    private List<ThinShow> availableShows;

    private List<ThinMovie> availableMovies;

    private List<ThinShow> wantedShows;

    private List<ThinMovie> wantedMovies;

}
