package com.example.microservices.demo.microservices.service.impl;

import com.example.microservices.demo.microservices.dto.UserRequestDto;
import com.example.microservices.demo.microservices.dto.UserResponseDto;
import com.example.microservices.demo.microservices.model.User;
import com.example.microservices.demo.microservices.repository.UserRepository;
import com.example.microservices.demo.microservices.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto createUser(UserRequestDto dto) {
        User user = new User(null, dto.getName(), dto.getEmail());
        User savedUser = userRepository.save(user);

        return new UserResponseDto(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail()
        );
    }

    @Override
    public UserResponseDto getUserById(String id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(user ->
                        new UserResponseDto(
                                user.getId(),
                                user.getName(),
                                user.getEmail()
                        ))
                .toList();
    }
}
