package com.example.REDIS.controller;

import com.example.REDIS.entity.Product;
import com.example.REDIS.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/redis")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping()
    public String getAll(){
        return productService.getProducts();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }
}
