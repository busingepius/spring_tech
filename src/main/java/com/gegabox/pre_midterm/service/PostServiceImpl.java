package com.gegabox.pre_midterm.service;

import com.gegabox.pre_midterm.entity.Post;
import com.gegabox.pre_midterm.repository.PostRepository;
import org.hibernate.query.Page;

import java.awt.print.Pageable;
import java.util.List;

public class PostServiceImpl implements PostService {
    PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getPost(long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public Post addpost(Post post) {
        return postRepository.save(post);

    }

    @Override
    public void deletePost(long id) {
        postRepository.deleteById(id);
    }

    @Override
    public void updatePost(long id,Post post) {
        postRepository.save(post);
    }
}
