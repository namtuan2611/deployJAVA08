package com.example.REDIS.service;

import com.example.REDIS.entity.Product;
import com.example.REDIS.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
//    @Autowired
//    private StringRedisTemplate redisTemplate;
    @Autowired
    private ProductRepo productRepo;
//    @Cacheable("products")
    public String getProducts(){
        return "all products";
    }
//    @Cacheable("product")
    public Product getProductById(int id){
        return productRepo.findById(id).orElse(null);
    }

}
