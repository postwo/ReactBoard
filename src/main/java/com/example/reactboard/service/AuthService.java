package com.example.reactboard.service;

import com.example.reactboard.dto.request.auth.SignInRequestDto;
import com.example.reactboard.dto.request.auth.SignUpRequestDto;
import com.example.reactboard.dto.response.auth.SignInResponseDto;
import com.example.reactboard.dto.response.auth.SignUpResponseDto;
import org.springframework.http.ResponseEntity;


public interface AuthService {

    //?는 SignUpResponseDto에 부모타입도 같이 반환을 한다는 뜻이다
    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);

    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
}
