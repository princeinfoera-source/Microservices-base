package com.example.product.product.service;


import com.example.product.product.dto.ProductRequestDto;
import com.example.product.product.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {

    ProductResponseDto createProduct(ProductRequestDto requestDto);

    ProductResponseDto getProductById(String id);

    List<ProductResponseDto> getAllProducts();
}
