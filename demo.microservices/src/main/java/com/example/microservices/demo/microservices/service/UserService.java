package com.example.microservices.demo.microservices.service;

import com.example.microservices.demo.microservices.dto.UserRequestDto;
import com.example.microservices.demo.microservices.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    UserResponseDto createUser(UserRequestDto userRequestDto);

    UserResponseDto getUserById(String id);

    List<UserResponseDto> getAllUsers();
}
