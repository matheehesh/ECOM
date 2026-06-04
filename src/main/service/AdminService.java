package com.ecom.ecom.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.ecom.ecom.repository.ProductRepository;
import com.ecom.ecom.entity.ProductEntity;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final ProductRepository productRepository;

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductEntity getProductById(String productId) {
        ProductEntity product = productRepository.findById(productId);
        if (product == null) {
            throw new RuntimeException("Product not found with id: " + productId);
        }
        return product;
    }

    public ProductEntity setProduct(ProductEntity productEntity){
        ProductEntity product = productRepository.findById(productId);
        if (product == null) {
            throw new RuntimeException("Product not found with id: " + productId);
        }
        productRepository.save(productEntity);
        return productEntity;
    }

    public String deleteProduct(String productId){
        ProductEntity product = productRepository.findById(productId);
            if (product == null) {
                throw new RuntimeException("Product not found with id: " + productId);
            }
        productRepository.deleteById(productId);
        return "Product with id: " + productId + " has been deleted.";
    }

}
