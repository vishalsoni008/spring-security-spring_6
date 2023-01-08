package com.vishal.springsecurityspring6.service;

import com.vishal.springsecurityspring6.model.User;
import com.vishal.springsecurityspring6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
