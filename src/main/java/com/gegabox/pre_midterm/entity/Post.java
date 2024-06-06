package com.gegabox.pre_midterm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String content;

    @ManyToOne(fetch= FetchType.LAZY,
            cascade=CascadeType.ALL)
    @JoinTable(name = "author_post_table")
    User author;

    @ManyToMany(mappedBy = "posts",cascade=CascadeType.ALL)

    List<Comment> comments;
}
