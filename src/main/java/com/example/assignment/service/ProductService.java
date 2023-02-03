package com.example.assignment.service;

import com.example.assignment.entity.Product;
import com.example.assignment.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public ResponseEntity<?> getProduct(@RequestParam String orderNumber){
       Product result =  productRepository.findByOrderNumber(orderNumber);
       if(result == null)
           return new ResponseEntity<String>("Unavailable", HttpStatus.SERVICE_UNAVAILABLE);
       else
           return ResponseEntity.ok(productRepository.findByOrderNumber(orderNumber));
    }
}
