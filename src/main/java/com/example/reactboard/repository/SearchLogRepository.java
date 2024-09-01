package com.example.reactboard.repository;

import com.example.reactboard.entity.SearchLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchLogRepository extends JpaRepository<SearchLogEntity,Integer> {
}
