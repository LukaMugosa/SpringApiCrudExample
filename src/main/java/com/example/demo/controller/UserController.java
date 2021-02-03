package com.example.demo.controller;


import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> allUsers(){
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public User storeUser(@RequestBody User user){
        return userService.save(user);
    }



}
