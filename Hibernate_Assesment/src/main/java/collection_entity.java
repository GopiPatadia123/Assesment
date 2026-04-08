package model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany
    private List<Artwork> artworks;

    // Getter Setter
}