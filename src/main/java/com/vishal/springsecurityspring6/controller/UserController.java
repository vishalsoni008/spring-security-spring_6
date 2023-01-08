package com.vishal.springsecurityspring6.controller;

import com.vishal.springsecurityspring6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    private ResponseEntity allUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }
}
