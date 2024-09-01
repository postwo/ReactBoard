package com.example.reactboard.entity.primaryKey;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class FavoritePk implements Serializable { //자기자신 pk가 없을 경우 이렇게 생성 == 복합키


    private String Email;

    private int board;
    
    
}
