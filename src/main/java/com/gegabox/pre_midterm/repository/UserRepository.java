package com.gegabox.pre_midterm.repository;

import com.gegabox.pre_midterm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//public class UserRepository  {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public List<User> findByTitleContaining(String title) {
//        TypedQuery<User> query = entityManager.createQuery(
//                "SELECT u FROM User u WHERE LOWER(u) LIKE LOWER(CONCAT('%', :title,'%'))",
//                User.class);
//        return query.setParameter("title", title).getResultList();
//    }

//public List<Tutorial> findByPublished(boolean isPublished) {
//    TypedQuery<Tutorial> query = entityManager.createQuery(
//        "SELECT t FROM Tutorial t WHERE t.published=:isPublished",
//        Tutorial.class);
//    return query.setParameter("isPublished", isPublished).getResultList();
//  }
//
//  public List<Tutorial> findByTitleAndPublished(String title, boolean isPublished) {
//    TypedQuery<Tutorial> query = entityManager.createQuery(
//        "SELECT t FROM Tutorial t WHERE LOWER(t.title) LIKE LOWER(CONCAT('%', :title,'%')) AND t.published=:isPublished",
//        Tutorial.class);
//    return query.setParameter("title", title).setParameter("isPublished", isPublished).getResultList();
//  }
//
//}

public interface UserRepository extends JpaRepository<User, Long> {
}

