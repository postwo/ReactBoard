package com.example.reactboard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentNumber;

    @Lob
    private String content;

    private LocalDateTime writeDatetime;

    @ManyToOne
    @JoinColumn(name = "userEmail", nullable = false)
    private UserEntity  Email;

    @ManyToOne
    @JoinColumn(name = "boardNumber", nullable = false)
    private BoardEntity  board;
}
