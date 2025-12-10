package com.example.product.product.controller;

import com.example.product.product.dto.ProductRequestDto;
import com.example.product.product.dto.ProductResponseDto;
import com.example.product.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto) {
        return productService.createProduct(requestDto);
    }

    @GetMapping("/{id}")
    public ProductResponseDto getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public List<ProductResponseDto> getAllProducts() {
        return productService.getAllProducts();
    }
}
