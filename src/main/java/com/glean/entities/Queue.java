package com.glean.entities;

import com.glean.repository.QueueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.HashMap;
import java.util.List;

/**
 * Created by michaelplott on 1/6/17.
 */
public class Queue {

    @Autowired
    private QueueRepo queues;

    private String userId;

    private List<Show> shows;

    private List<Movie> movies;

    private List<Genre> genres;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    //Method to add shows to a users queue.

    public void addShowToQueue(User user, Show show) {
        Queue queue = queues.findByUserId(user.getId());
        queue.shows.add(show);
        for (Genre genre : show.getGenres()) {
            queue.genres.add(genre);
        }
        queues.save(queue);
    }

    //Method to add movies to a users queue.

    public void addMovieToQueue(User user, Movie movie) {
        Queue queue = queues.findByUserId(user.getId());
        queue.movies.add(movie);
        for (Genre genre : movie.getGenres()) {
            queue.genres.add(genre);
        }
        queues.save(queue);
    }

    //Method is going to pull all genres from a users queue and pull media from shows and movies repo depending on
    //what genres are most added to their queue. I.E. if the user has multiple horror movies added to their queue the
    //method will pull out a few random movies and shows they may be interested in.

//    public HashMap<String, List> getMediaSuggestions(User user) {
//        Queue queue = queues.findByUserId(user.getId());
//
//    }
}
