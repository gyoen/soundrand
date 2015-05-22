package com.orange.sc.soundcloudrand.rest.models;

/**
 * Created by ggc on 31/03/15.
 */
public class Tracks {

    private String Id;
    private Integer id;
    private String title;
    private String artist;
    private Integer upvotes;

    /**
     *
     * @return
     * The Id
     */
//    public String getId() {
//        return Id;
//    }

    /**
     *
     * @param Id
     * The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     *
     * @param artist
     * The artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     *
     * @return
     * The upvotes
     */
    public Integer getUpvotes() {
        return upvotes;
    }

    /**
     *
     * @param upvotes
     * The upvotes
     */
    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

}
