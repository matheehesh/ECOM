package com.ecom.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.Optional;

import com.ecom.ecom.repository.ProductRepository;
import com.ecom.ecom.entity.ProductEntity;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final ProductRepository productRepository;

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductEntity getProductById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found with id: " + productId));
    }

    public ProductEntity setProduct(ProductEntity product) {
        return productRepository.save(product);
    }

    public String deleteProduct(Long productId) {
        productRepository.deleteById(productId);
        return "Product with id: " + productId + " deleted";

    }
}
