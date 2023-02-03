package com.example.assignment.repository;

import com.example.assignment.entity.Price;
import com.example.assignment.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price,Long> {
    Price findByCountryCode(String countryCode);
}
