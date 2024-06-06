package com.gegabox.pre_midterm.repository;

import com.gegabox.pre_midterm.entity.Post;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
    Pageable sortedByName =
            PageRequest.of(0, 3, Sort.by("name"));

    Pageable sortedByPriceDesc =
            PageRequest.of(0, 3, Sort.by("price").descending());

    Pageable sortedByPriceDescNameAsc =
            PageRequest.of(0, 5, Sort.by("price").descending().and(Sort.by("name")));

//    List<Post> findAll(Pageable pageable, Sort sort);
}
