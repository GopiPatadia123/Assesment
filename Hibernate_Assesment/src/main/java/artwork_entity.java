package model;

import jakarta.persistence.*;

@Entity
public class Artwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String tags;
    private String resolution;

    @ManyToOne
    private Artist artist;

    // Getter Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getTags() { return tags; }
    public void setTags(String tags) { this.tags = tags; }

    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }

    public Artist getArtist() { return artist; }
    public void setArtist(Artist artist) { this.artist = artist; }
}