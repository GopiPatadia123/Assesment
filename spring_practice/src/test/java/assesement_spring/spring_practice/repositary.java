package com.blogify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blogify.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}

package com.blogify.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.blogify.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findByTitleContaining(String keyword);
    List<Blog> findByTagsContaining(String tag);
    List<Blog> findByUserId(int userId);
}
