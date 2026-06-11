package com.ecom.ecom.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.ecom.ecom.service.AdminService;
import com.ecom.ecom.service.ProductService;
import com.ecom.ecom.entity.ProductEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/products")
public class AdminController {
    private final AdminService adminService;
    private final ProductService productService;


    @GetMapping("/view")
    public List<ProductEntity> getAllProducts(){
        return adminService.getAllProducts();
    }

    @GetMapping("/view/{productId}")
    public ProductEntity getProductById(@PathVariable Long productId){
        return adminService.getProductById(productId);
    }

    @PostMapping("/new")
    public ProductEntity setProduct(@RequestBody ProductEntity product){
        return adminService.setProduct(product);
    }

    @DeleteMapping("/delete/{productId}")
    public void deleteProduct(@PathVariable Long productId){
        adminService.deleteProduct(productId);
    }

}
