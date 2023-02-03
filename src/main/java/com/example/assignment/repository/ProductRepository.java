package com.example.assignment.repository;

import com.example.assignment.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByOrderNumber(String orderNumber);
}
