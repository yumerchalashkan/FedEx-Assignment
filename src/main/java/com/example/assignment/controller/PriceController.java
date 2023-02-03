package com.example.assignment.controller;

import com.example.assignment.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PriceController {
    private final PriceService priceService;

    @GetMapping("/pricing")
    public ResponseEntity<?> getProduct(@RequestParam String countryCode){
        return ResponseEntity.ok(priceService.getPrice(countryCode));
    }
}
