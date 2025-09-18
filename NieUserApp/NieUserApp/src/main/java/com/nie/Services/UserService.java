package com.nie.Services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nie.model.User;
import com.nie.Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Add a new user
    public String addUser(User user) {
        userRepository.save(user);
        return "User added successfully with ID: " + user.getUserId();
    }
}
