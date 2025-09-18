package com.nie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nie.model.User;
import com.nie.Services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    // GET all users
    @GetMapping("/user")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    // POST a new user
    @PostMapping("/user")
    public String addUser(@RequestBody User user) {
        return service.addUser(user);
    }
}
