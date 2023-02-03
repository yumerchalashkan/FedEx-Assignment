package com.example.assignment.service;

import com.example.assignment.entity.Product;
import com.example.assignment.entity.Track;
import com.example.assignment.repository.TrackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class TrackService {
    private final TrackRepository trackRepository;

    public ResponseEntity<?> getProduct(@RequestParam String orderNumber){
        Track result =  trackRepository.findByOrderNumber(orderNumber);
        if(result == null)
            return new ResponseEntity<String>("Unavailable", HttpStatus.SERVICE_UNAVAILABLE);
        else
            return ResponseEntity.ok(trackRepository.findByOrderNumber(orderNumber));
    }
}
