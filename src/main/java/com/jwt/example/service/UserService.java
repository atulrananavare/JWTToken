package com.jwt.example.service;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User(UUID.randomUUID().toString(), "Atul", "atul@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "Raji", "Raji@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "Shub", "Shub@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "Jivan", "Jivan@gmail.com"));
    }

    public List<User> getUserList(){
        return userList;
    }
}
