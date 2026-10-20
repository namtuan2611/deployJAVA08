package com.example.REDIS.repository;

import com.example.REDIS.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
