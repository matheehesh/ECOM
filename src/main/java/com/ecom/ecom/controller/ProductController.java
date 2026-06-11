package com.ecom.ecom.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.ecom.ecom.service.ProductService;
import com.ecom.ecom.entity.ProductEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductEntity> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{Id}")
    public ProductEntity getProductById(@PathVariable Long productId){
        return productService.getProductById(productId);
    }
    
}
