package com.example.reactboard.service.implement;

import com.example.reactboard.dto.request.auth.SignUpRequestDto;
import com.example.reactboard.dto.response.ResponseDto;
import com.example.reactboard.dto.response.auth.SignUpResponseDto;
import com.example.reactboard.entity.UserEntity;
import com.example.reactboard.repository.UserRepository;
import com.example.reactboard.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImplement implements AuthService {//impl 은 인터페이스 구현체를 의미한다

    private final UserRepository userRepository;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto) {


        try{
            log.info("여기 도착");
            String email = dto.getEmail();
            boolean existedEmail = userRepository.existsByEmail(email);
            if (existedEmail) return SignUpResponseDto.duplicateEmail();

            String nickname = dto.getNickname();
            boolean existedNickname = userRepository.existsByNickname(nickname);
            if (existedNickname) return SignUpResponseDto.duplicateNickname();

            String telNumber = dto.getTelNumber();
            boolean existedTelNumber = userRepository.existsByTelNumber(telNumber);
            if (existedTelNumber) return SignUpResponseDto.duplicateTelNumber();

            dto.setPassword(passwordEncoder.encode(dto.getPassword()));

            UserEntity userEntity = new UserEntity(dto);
            
            log.info("여기 까지 통과");

            userRepository.save(userEntity);


        }catch (Exception e){
            e.printStackTrace();
            return ResponseDto.databaseError();
        }

        return SignUpResponseDto.success();
    }

}
