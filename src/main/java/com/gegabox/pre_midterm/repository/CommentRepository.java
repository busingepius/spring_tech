package com.gegabox.pre_midterm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gegabox.pre_midterm.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
