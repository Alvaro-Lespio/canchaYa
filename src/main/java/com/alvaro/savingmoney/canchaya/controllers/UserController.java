package com.alvaro.savingmoney.canchaya.controllers;

import com.alvaro.savingmoney.canchaya.entities.User;
import com.alvaro.savingmoney.canchaya.services.impl.UserServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    //Injection Dependency
    private UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    //Create user
    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody User user){
        return new ResponseEntity<>(userService.createUser(user),HttpStatus.CREATED);
    }
    //Delete user
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        return new ResponseEntity<>(userService.deleteUser(id),HttpStatus.OK);
    }
    //Update user
    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@Valid @RequestBody User user,@PathVariable Long id){
        return new ResponseEntity<>(userService.updateUser(user,id),HttpStatus.OK);
    }

    //List users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.listUser(),HttpStatus.OK);
    }

}
