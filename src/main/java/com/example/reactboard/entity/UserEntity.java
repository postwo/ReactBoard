package com.example.reactboard.entity;

import com.example.reactboard.dto.request.auth.SignUpRequestDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity (name = "user")
public class UserEntity {

    @Id
    @Column(nullable = false,length = 50)
    private String email;

    @Column(nullable = false,length = 100)
    private String password;

    @Column(nullable = false,length = 20)
    private String nickname;

    @Column(nullable = false,length = 15)
    private String telNumber;

    @Lob
    @Column(nullable = false)
    private String address;

    @Lob
    private String addressDetail;

    @Lob
    private String profileImage;

    @Column(nullable = false)
    private boolean agreedPersonal;

//      이거는 마이페이지 보여줄일 있으면 사용
//    @OneToMany(mappedBy = "email", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<CommentEntity> comments = new ArrayList<>();
//
//    @OneToMany(mappedBy = "email", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<FavoriteEntity> favorites = new ArrayList<>();


    public UserEntity(SignUpRequestDto dto){
        this.email = dto.getEmail();
        this.password = dto.getPassword();
        this.nickname = dto.getNickname();
        this.telNumber = dto.getTelNumber();
        this.address = dto.getAddress();
        this.addressDetail = dto.getAddressDetail();
        this.agreedPersonal = dto.getAgreedPersonal();
    }

}
