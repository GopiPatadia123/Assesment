package model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type; // personal, commercial, exclusive
    private String status;
    private Date expiryDate;

    @ManyToOne
    private Artwork artwork;

    // Getter Setter
}