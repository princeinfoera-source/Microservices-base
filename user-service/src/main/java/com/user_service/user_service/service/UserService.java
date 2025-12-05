package com.user_service.user_service.service;

import com.user_service.user_service.dto.UserRequestDto;
import com.user_service.user_service.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    UserResponseDto createUser(UserRequestDto userRequestDto);

    UserResponseDto getUserById(String id);

    List<UserResponseDto> getAllUsers();
}
