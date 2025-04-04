package com.tracking.lib.dto.user;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(name = "UserInfoVo", description = "UserInfo 정보 응답모델")
public class UsersDto {

    @Column(name = "user_no")
    @Schema(description = "사용자번호")
    private String userNo;

    @Schema(description = "사용자ID")
    private String userId;

    @Schema(description = "사용자이름")
    private String userName;

    @Schema(description = "패스워드")
    private String userPw;

    @Schema(description = "이메일")
    private String email;

    @Schema(description = "핸드폰번호")
    private String phoneNumber;

    @Schema(description = "API 인증키")
    private String authKey;

    @Schema(description = "마지막 로그인 일시")
    private LocalDateTime lastLoginDtime;

    @Schema(description = "등록자번호")
    private String regNo;

    @Schema(description = "등록일시")
    private LocalDateTime regDtime;

    @Schema(description = "수정자번호")
    private String modNo;

    @Schema(description = "수정일시")
    private LocalDateTime modDtime;

    @Schema(description = "접근토큰")
    private String accessToken;

}
