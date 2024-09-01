package com.example.reactboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "board_list_view")
@Immutable //엔티티를 읽기 전용으로 설정
public class BoardListViewEntity { //뷰테이블은 entity 타입을 지정할 필요 없다

    @Id
    private int boardNumber;
    private String title;
    private String content;
    private String titleImage; //I
    private int viewCount;
    private int favoriteCount;
    private int commentCount;
    private String writeDatetime;
    private String writerEmail; //U
    private String writerNickname; //U
    private String writeProfileImage; //U
}
