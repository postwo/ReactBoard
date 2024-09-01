package com.example.reactboard.repository;

import com.example.reactboard.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity,Integer> {
}
