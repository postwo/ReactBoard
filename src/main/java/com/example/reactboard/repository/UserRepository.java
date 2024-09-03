package com.example.reactboard.repository;


import com.example.reactboard.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,String> {

    //이메일 값이 존재하는 조회
    boolean existsByEmail(String email);

    boolean existsByNickname(String nickname);

    boolean existsByTelNumber(String telNumber);

    //로그인
    UserEntity findByEmail(String email);
}
