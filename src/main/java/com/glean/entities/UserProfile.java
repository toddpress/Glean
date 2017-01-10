package com.glean.entities;

import java.util.List;

/**
 * Created by justi on 12/30/2016.
 */
public class UserProfile {

    User user;

    private List<Source> sources;

    private List<ThinShow> availableShows;

    private List<ThinMovie> availableMovies;

    private List<ThinShow> wantedShows;

    private List<ThinMovie> wantedMovies;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public List<ThinShow> getAvailableShows() {
        return availableShows;
    }

    public void setAvailableShows(List<ThinShow> availableShows) {
        this.availableShows = availableShows;
    }

    public List<ThinMovie> getAvailableMovies() {
        return availableMovies;
    }

    public void setAvailableMovies(List<ThinMovie> availableMovies) {
        this.availableMovies = availableMovies;
    }

    public List<ThinShow> getWantedShows() {
        return wantedShows;
    }

    public void setWantedShows(List<ThinShow> wantedShows) {
        this.wantedShows = wantedShows;
    }

    public List<ThinMovie> getWantedMovies() {
        return wantedMovies;
    }

    public void setWantedMovies(List<ThinMovie> wantedMovies) {
        this.wantedMovies = wantedMovies;
    }
}
