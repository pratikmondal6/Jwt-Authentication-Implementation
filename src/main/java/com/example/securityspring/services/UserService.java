package com.example.securityspring.services;

import com.example.securityspring.entity.User;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService(){

      //  userList.add(new User(UUID.randomUUID().toString(), "pratik", "pratik@gmail.com"));
      //  userList.add(new User(UUID.randomUUID().toString(), "userTwo", "usertwo@gmail.com"));
      //  userList.add(new User(UUID.randomUUID().toString(), "userThree", "userthree@gmail.com"));
    }

    public List<User> getUser(){
        return this.userList;
    }

}
