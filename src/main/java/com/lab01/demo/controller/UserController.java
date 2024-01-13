package com.lab01.demo.controller;

import com.lab01.demo.entity.User;
import com.lab01.demo.responsitory.User_Responsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    User_Responsitory userResponsitory;
    @GetMapping("/all")
    List<User> getListUser(){
        return  userResponsitory.findAll();
    }

    @GetMapping("/getuser")
    User getUserById(@RequestParam String id){
        return userResponsitory.findById(id).get();
    }
}
