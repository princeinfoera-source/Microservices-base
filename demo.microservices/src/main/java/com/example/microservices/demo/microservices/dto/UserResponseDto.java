package com.example.microservices.demo.microservices.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserResponseDto {
    private String id;
    private String name;
    private String email;
}
