package com.blogify.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @Column(length = 5000)
    private String content;

    private String tags;

    private int userId;
}
