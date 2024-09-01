package com.example.reactboard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "image")
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sequence;

    @ManyToOne
    @JoinColumn(name = "boardNumber", nullable = false)
    private BoardEntity board;

    @Lob
    private String image;
}
