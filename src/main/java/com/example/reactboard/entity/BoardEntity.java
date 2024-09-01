package com.example.reactboard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardNumber;

    @Lob
    private String title;

    @Lob
    private String content;

    private LocalDateTime writeDatetime;

    @Column(nullable = false)
    private int favoriteCount;

    @Column(nullable = false)
    private int commentCount;

    @Column(nullable = false)
    private int viewCount;

    @ManyToOne
    @JoinColumn(name = "writerEmail",nullable = false)
    private UserEntity Email;

    // 게시판 내용 필요할때
//    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<CommentEntity> comments = new ArrayList<>();
//
//    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<ImageEntity> images = new ArrayList<>();


}
