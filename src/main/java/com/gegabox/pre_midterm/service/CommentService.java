package com.gegabox.pre_midterm.service;

import com.gegabox.pre_midterm.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getComments();
    Comment getComment(long id);
    Comment addComment(Comment comment);
    void deleteComment(long id);
    void updatecomment(long id,Comment comment);
}
