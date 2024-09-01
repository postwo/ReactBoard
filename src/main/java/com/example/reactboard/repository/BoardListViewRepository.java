package com.example.reactboard.repository;

import com.example.reactboard.entity.BoardListViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardListViewRepository extends JpaRepository<BoardListViewEntity,Integer> {
}
