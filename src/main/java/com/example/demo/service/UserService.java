package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserRepository {

    private List<User> usersList = new ArrayList<>();

    @Override
    public List<User> findAll() {
        return this.usersList;
    }

    @Override
    public User save(User user) {
        this.usersList.add(user);
        return user;
    }
}
