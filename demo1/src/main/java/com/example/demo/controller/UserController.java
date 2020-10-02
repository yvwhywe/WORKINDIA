package com.example.demo.controller;

import com.example.demo.DAO.UserDAO;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDAO userDAO;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(path="/user/{userid}/{password}")
    public void addUserPassword(@PathVariable("userid") String userid, @PathVariable("password") String password) {

        User user = new User(userid, password);
        //store the user name and password in MYSQL user table
        userDAO.save(user);
        System.out.println("Userid and password stored in MYSQL");
    }

    @GetMapping(path="/user/{userid}", produces= {"application/json"})
    public User addUserPassword(@PathVariable("userid") String userid) {

        //Get the user password from user table
        User user = userDAO.findById(userid).orElse(new User());
        System.out.println(user.toString());
        return user;
    }

}
