package com.lorraine.project_management.controller;

import com.lorraine.project_management.dto.ResponseWrapper;
import com.lorraine.project_management.dto.UserDto;
import com.lorraine.project_management.service.UserService;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

@GetMapping
public ResponseEntity<ResponseWrapper> getUser(){
    List<UserDto> userDToList= userService.listAllUsers();
    return ResponseEntity.ok(new ResponseWrapper("User List", userDToList, HttpStatus.OK));
}
}
