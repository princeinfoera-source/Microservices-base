package com.example.product.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductResponseDto {
    private String id;
    private String name;
    private double price;
}
