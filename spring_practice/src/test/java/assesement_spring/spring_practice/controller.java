package com.blogify.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.blogify.model.User;
import com.blogify.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        HttpSession session) {

        User user = service.login(email, password);

        if (user != null) {
            session.setAttribute("user", user);
            return "Login Success";
        }
        return "Invalid Credentials";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "Logged out";
    }
}

package com.blogify.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.blogify.model.Blog;
import com.blogify.model.User;
import com.blogify.service.BlogService;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService service;

    @PostMapping("/create")
    public Object create(@RequestBody Blog blog, HttpSession session) {
        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "Login required";
        }

        blog.setUserId(user.getId());
        return service.create(blog);
    }

    @GetMapping("/all")
    public List<Blog> getAll() {
        return service.getAll();
    }

    @GetMapping("/search")
    public List<Blog> search(@RequestParam String keyword) {
        return service.search(keyword);
    }

    @GetMapping("/my")
    public Object myBlogs(HttpSession session) {
        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "Login required";
        }

        return service.getByUser(user.getId());
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted";
    }
}
