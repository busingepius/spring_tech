package com.gegabox.pre_midterm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public Comment() {
    }

    public Comment(long id, String name) {
        this.id = id;
        this.name = name;
    }


    @ManyToMany(/*mappedBy = "comments",*/cascade = CascadeType.ALL)
    @JoinTable

    List<Post> posts;
}
