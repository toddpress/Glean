package com.glean.entities;

/**
 * Created by michaelplott on 12/17/16.
 */
public class Source {

    private enum Sources {
        FREE,
        PURCHASE,
        SUBSCRIPTION,
        TV_EVERYWHERE;
    }

    private String downloadLink;

    private String name;

    private String displayName;

    private String sourceLink;

    private String source;

    public Source() {
    }

    public Source(String downloadLink, String name, String displayName, String sourceLink, String source) {
        this.downloadLink = downloadLink;
        this.name = name;
        this.displayName = displayName;
        this.sourceLink = sourceLink;
        this.source = source;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
