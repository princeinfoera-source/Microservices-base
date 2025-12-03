package com.example.microservices.demo.microservices.controller;

import com.example.microservices.demo.microservices.dto.UserRequestDto;
import com.example.microservices.demo.microservices.dto.UserResponseDto;
import com.example.microservices.demo.microservices.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserResponseDto createUser(@RequestBody UserRequestDto requestDto) {
        return userService.createUser(requestDto);
    }

    @GetMapping("/{id}")
    public UserResponseDto getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<UserResponseDto> getAllUsers() {
        return userService.getAllUsers();
    }
}
