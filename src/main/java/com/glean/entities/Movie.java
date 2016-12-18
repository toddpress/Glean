package com.glean.entities;

/**
 * Created by michaelplott on 12/17/16.
 */
public class Movie extends Media {

    private String in_theaters;

    private String poster_120x171;

    private String poster_240x342;

    private String poster_400x570;

    private String pre_order;

    private String rating;

    private String release_date;

    private String release_year;

    private String rottentomatoes;

    private Genre genre;

    public Movie() {
    }

    public Movie(String in_theaters, String poster_120x171, String poster_240x342, String poster_400x570, String pre_order, String rating, String release_date, String release_year, String rottentomatoes, Genre genre) {
        this.in_theaters = in_theaters;
        this.poster_120x171 = poster_120x171;
        this.poster_240x342 = poster_240x342;
        this.poster_400x570 = poster_400x570;
        this.pre_order = pre_order;
        this.rating = rating;
        this.release_date = release_date;
        this.release_year = release_year;
        this.rottentomatoes = rottentomatoes;
        this.genre = genre;
    }

    public String getIn_theaters() {
        return in_theaters;
    }

    public void setIn_theaters(String in_theaters) {
        this.in_theaters = in_theaters;
    }

    public String getPoster_120x171() {
        return poster_120x171;
    }

    public void setPoster_120x171(String poster_120x171) {
        this.poster_120x171 = poster_120x171;
    }

    public String getPoster_240x342() {
        return poster_240x342;
    }

    public void setPoster_240x342(String poster_240x342) {
        this.poster_240x342 = poster_240x342;
    }

    public String getPoster_400x570() {
        return poster_400x570;
    }

    public void setPoster_400x570(String poster_400x570) {
        this.poster_400x570 = poster_400x570;
    }

    public String getPre_order() {
        return pre_order;
    }

    public void setPre_order(String pre_order) {
        this.pre_order = pre_order;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getRelease_year() {
        return release_year;
    }

    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }

    public String getRottentomatoes() {
        return rottentomatoes;
    }

    public void setRottentomatoes(String rottentomatoes) {
        this.rottentomatoes = rottentomatoes;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
