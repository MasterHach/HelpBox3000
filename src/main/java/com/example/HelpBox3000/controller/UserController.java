package com.example.HelpBox3000.controller;


import com.example.HelpBox3000.entity.UserEntity;
import com.example.HelpBox3000.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/registration")
    public ResponseEntity<UserEntity> registrationUsers(@RequestBody UserEntity userEntity) {
        return ResponseEntity.ok(this.userService.userRegistration(userEntity));
    }

    @GetMapping(value = "/auth")
    public ResponseEntity<UserEntity> authorizationUser(@RequestBody String id) {
        return ResponseEntity.ok(this.userService.userAuthorization(id));
    }
}
