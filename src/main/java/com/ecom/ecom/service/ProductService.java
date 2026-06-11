package com.ecom.ecom.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

import com.ecom.ecom.entity.ProductEntity;
import com.ecom.ecom.repository.ProductRepository;



@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductEntity getProductById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Product not found with id: " + productId));
    }

}
