package com.example.reactboard.dto.response.auth;

import com.example.reactboard.common.ResponseCode;
import com.example.reactboard.common.ResponseMessage;
import com.example.reactboard.dto.response.ResponseDto;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
public class SignInResponseDto extends ResponseDto {

        private String token;
        private int expirationTime;

        public SignInResponseDto(String token) {
                super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
                this.token = token;
                this.expirationTime = 3600; // 만료시간 1시간으로 설정
        }

        //로그인 성공
        public static ResponseEntity<SignInResponseDto> success(String token){
                SignInResponseDto result = new SignInResponseDto(token);
                return ResponseEntity.status(HttpStatus.OK).body(result);
        }

        //로그인 실패
        public static ResponseEntity<ResponseDto> signInFailed(){
                ResponseDto result = new ResponseDto(ResponseCode.SIGN_IN_FAIL,ResponseMessage.SIGN_IN_FAIL);
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);
        }
}
