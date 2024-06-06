package com.gegabox.pre_midterm.service;

import com.gegabox.pre_midterm.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> getPosts();
    Post getPost(long id);
    Post addpost(Post post);
    void deletePost(long id);
    public void updatePost(long id,Post post);
}
