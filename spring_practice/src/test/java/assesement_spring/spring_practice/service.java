package com.blogify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blogify.model.User;
import com.blogify.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public User login(String email, String password) {
        User user = repo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}

package com.blogify.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blogify.model.Blog;
import com.blogify.repository.BlogRepository;

@Service
public class BlogService {

    @Autowired
    private BlogRepository repo;

    public Blog create(Blog blog) {
        return repo.save(blog);
    }

    public List<Blog> getAll() {
        return repo.findAll();
    }

    public List<Blog> search(String keyword) {
        return repo.findByTitleContaining(keyword);
    }

    public List<Blog> getByUser(int userId) {
        return repo.findByUserId(userId);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}

