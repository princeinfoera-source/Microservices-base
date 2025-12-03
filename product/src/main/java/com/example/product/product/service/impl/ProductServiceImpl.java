package com.example.product.product.service.impl;

import com.example.product.product.dto.ProductRequestDto;
import com.example.product.product.dto.ProductResponseDto;
import com.example.product.product.model.Product;
import com.example.product.product.repository.ProductRepository;
import com.example.product.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductResponseDto createProduct(ProductRequestDto dto) {
        Product product = new Product(null, dto.getName(), dto.getPrice());
        Product savedProduct = productRepository.save(product);

        return new ProductResponseDto(
                savedProduct.getId(),
                savedProduct.getName(),
                savedProduct.getPrice()
        );
    }

    @Override
    public ProductResponseDto getProductById(String id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        return new ProductResponseDto(
                product.getId(),
                product.getName(),
                product.getPrice()
        );
    }

    @Override
    public List<ProductResponseDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product ->
                        new ProductResponseDto(
                                product.getId(),
                                product.getName(),
                                product.getPrice()
                        ))
                .toList();
    }
}
