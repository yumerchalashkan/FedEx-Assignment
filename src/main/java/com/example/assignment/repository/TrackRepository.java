package com.example.assignment.repository;

import com.example.assignment.entity.Product;
import com.example.assignment.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track,Long> {
    Track findByOrderNumber(String orderNumber);
}
