package com.adit.simpleWebApp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.adit.simpleWebApp.model.User;

@Service
public class UserService {

    private Map<String, User> users = new HashMap<>();

    public void signup(User user) {
        if (!users.containsKey(user.getUsername())) {
            users.put(user.getUsername(), user);
        } else {
            throw new RuntimeException("User already exists");
        }
    }

    public User login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }

      public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }
}
