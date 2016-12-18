package com.glean.entities;

/**
 * Created by michaelplott on 12/17/16.
 */
public class Show extends Media {

    private String content_type;

    private String episode_number;

    private String first_aired;

    private String season_number;

    private String show_id;

    private String thumbnail_208x117;

    private String thumbnail_304x171;

    private String thumbnail_400x225;

    private String thumbnail_608x342;

    public Show() {
    }

    public Show(String content_type, String episode_number, String first_aired, String season_number, String show_id, String thumbnail_208x117, String thumbnail_304x171, String thumbnail_400x225, String thumbnail_608x342) {
        this.content_type = content_type;
        this.episode_number = episode_number;
        this.first_aired = first_aired;
        this.season_number = season_number;
        this.show_id = show_id;
        this.thumbnail_208x117 = thumbnail_208x117;
        this.thumbnail_304x171 = thumbnail_304x171;
        this.thumbnail_400x225 = thumbnail_400x225;
        this.thumbnail_608x342 = thumbnail_608x342;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public String getEpisode_number() {
        return episode_number;
    }

    public void setEpisode_number(String episode_number) {
        this.episode_number = episode_number;
    }

    public String getFirst_aired() {
        return first_aired;
    }

    public void setFirst_aired(String first_aired) {
        this.first_aired = first_aired;
    }

    public String getSeason_number() {
        return season_number;
    }

    public void setSeason_number(String season_number) {
        this.season_number = season_number;
    }

    public String getShow_id() {
        return show_id;
    }

    public void setShow_id(String show_id) {
        this.show_id = show_id;
    }

    public String getThumbnail_208x117() {
        return thumbnail_208x117;
    }

    public void setThumbnail_208x117(String thumbnail_208x117) {
        this.thumbnail_208x117 = thumbnail_208x117;
    }

    public String getThumbnail_304x171() {
        return thumbnail_304x171;
    }

    public void setThumbnail_304x171(String thumbnail_304x171) {
        this.thumbnail_304x171 = thumbnail_304x171;
    }

    public String getThumbnail_400x225() {
        return thumbnail_400x225;
    }

    public void setThumbnail_400x225(String thumbnail_400x225) {
        this.thumbnail_400x225 = thumbnail_400x225;
    }

    public String getThumbnail_608x342() {
        return thumbnail_608x342;
    }

    public void setThumbnail_608x342(String thumbnail_608x342) {
        this.thumbnail_608x342 = thumbnail_608x342;
    }
}