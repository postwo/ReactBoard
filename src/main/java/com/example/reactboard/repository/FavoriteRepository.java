package com.example.reactboard.repository;

import com.example.reactboard.entity.FavoriteEntity;
import com.example.reactboard.entity.primaryKey.FavoritePk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<FavoriteEntity, FavoritePk> {

}
