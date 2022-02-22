package com.example.HelpBox3000.controller;


import com.example.HelpBox3000.cfg.OrikaCfg;
import com.example.HelpBox3000.dto.UserDTO;
import com.example.HelpBox3000.entity.UserEntity;
import com.example.HelpBox3000.service.UserService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    private MapperFacade facade = new OrikaCfg();

    @PostMapping(value = "/registration")
    public ResponseEntity<UserDTO> registrationUsers(@RequestBody UserEntity userEntity) {
        UserDTO result = this.facade.map(this.userService.userRegistration(userEntity), UserDTO.class);
        return new ResponseEntity<UserDTO>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/auth")
    public ResponseEntity<UserDTO> authorizationUser(@RequestParam String email, @RequestBody String password) {
        UserDTO result = this.facade.map(this.userService.userAuthorization(email, password), UserDTO.class);
        return new ResponseEntity<UserDTO>(result, HttpStatus.OK);
    }
}
