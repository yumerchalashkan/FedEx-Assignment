package com.example.assignment.controller;

import com.example.assignment.service.TrackService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TrackController {
    private final TrackService trackService;

    @GetMapping("/track-status")
    public ResponseEntity<?> getProduct(@RequestParam String orderNumber){
        return ResponseEntity.ok(trackService.getProduct(orderNumber));
    }
}
