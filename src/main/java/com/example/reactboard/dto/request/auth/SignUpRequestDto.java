package com.example.reactboard.dto.request.auth;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignUpRequestDto { // 프론트에서 받아오는 것들

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 8, max = 20)
    private String password;

    @NotBlank
    @Pattern(regexp = "^[0-9]{11,13}$")
    private String nickname;

    private String telNumber;

    @NotBlank
    private String address;

    private String addressDetail;

    @NotNull
    @AssertTrue
    private Boolean agreedPersonal;
}
