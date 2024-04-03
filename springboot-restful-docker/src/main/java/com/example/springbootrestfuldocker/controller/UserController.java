package com.example.springbootrestfuldocker.controller;

import com.example.springbootrestfuldocker.entity.User;
import com.example.springbootrestfuldocker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
      User user1 =  userService.createUser(user);
      return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getByUserId(@PathVariable("id")  @RequestBody Long userId){
       User getUser = userService.findById(userId);
       return new ResponseEntity<>(getUser, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<User> updatebyUserId(@PathVariable ("id") @RequestBody User user){
       User updateUser =  userService.updateUser(user);
       return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }
}
