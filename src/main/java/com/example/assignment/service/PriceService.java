package com.example.assignment.service;

import com.example.assignment.entity.Price;
import com.example.assignment.entity.Track;
import com.example.assignment.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class PriceService {
    private final PriceRepository priceRepository;

    public ResponseEntity<?> getPrice(@RequestParam String countryCode){
        Price result =  priceRepository.findByCountryCode(countryCode);
        if(result == null)
            return new ResponseEntity<String>("Unavailable", HttpStatus.SERVICE_UNAVAILABLE);
        else
            return ResponseEntity.ok(priceRepository.findByCountryCode(countryCode));
    }
}
