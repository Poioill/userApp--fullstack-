package com.example.fullstack.controller;

import com.example.fullstack.entity.User;
import com.example.fullstack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String homePage(){
        return "Successfully works!";
    }

    @PostMapping("/user")
    public String newUser(@RequestBody User newUser){
        userService.saveUser(newUser);
        return "User added";
    }

    @GetMapping("/users")
    public List<User> allUsers(){
        return userService.allUsers();
    }
}
