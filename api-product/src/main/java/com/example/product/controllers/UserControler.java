package com.example.product.controllers;


import com.example.product.models.User;
import com.example.product.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserControler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    List<User> getUsers() {
        return userRepository.findAll();
    }
}
