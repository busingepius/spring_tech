package com.gegabox.pre_midterm.service;

import com.gegabox.pre_midterm.entity.Comment;
import com.gegabox.pre_midterm.repository.CommentRepository;
import com.gegabox.pre_midterm.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment getComment(long id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteComment(long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public void updatecomment(long id, Comment comment) {
        commentRepository.save(comment);
    }
}
