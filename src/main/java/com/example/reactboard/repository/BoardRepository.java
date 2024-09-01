package com.example.reactboard.repository;

import com.example.reactboard.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity,Integer> {


}
