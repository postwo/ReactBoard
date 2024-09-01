package com.example.reactboard.entity;

import com.example.reactboard.entity.primaryKey.FavoritePk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "favorite")
@IdClass(FavoritePk.class) // == 복합키 표시
public class FavoriteEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "userEmail",nullable = false)
    private UserEntity  Email;

    @Id
    @ManyToOne
    @JoinColumn(name = "boardNumber", nullable = false)
    private BoardEntity  board;
}
