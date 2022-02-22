package com.example.dockerdemo.controller;

import com.example.dockerdemo.jpo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.dockerdemo.repos.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserRepository repository;

    @PostMapping("/user")
    User createUser(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping
    List<User> getAlluser() {
        return repository.findAll();
    }
}
