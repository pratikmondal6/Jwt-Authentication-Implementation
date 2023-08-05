package com.example.securityspring.controller;

import com.example.securityspring.entity.User;
import com.example.securityspring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService userService;

    //http://localhost:8081/home/users
    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("users");
        return userService.getUser();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }

}
