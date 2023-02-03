package com.example.assignment.controller;

import com.example.assignment.repository.ProductRepository;
import com.example.assignment.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {



    private final ProductService productService;

    @GetMapping("/shipment-products")
    public ResponseEntity<?> getProduct(@RequestParam String orderNumber){
        return ResponseEntity.ok(productService.getProduct(orderNumber));
    }
}
