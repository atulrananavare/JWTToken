package com.jwt.example.controller;

import com.jwt.example.models.User;
import com.jwt.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/home")
public class Homecontroller {
    Logger logger = LoggerFactory.getLogger(Homecontroller.class);

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        this.logger.warn("This is working message");
        return "Testing message";
    }

    @GetMapping("/getListOfUser")
    public List<User> getUsers() {
        return userService.getUserList();
    }
}
