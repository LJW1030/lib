package com.tracking.lib.domain;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users", schema = "office") // 실제 테이블명 지정
@Schema(name = "Users 모델", description = "Users 모델 정보")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no")
    @Schema(description = "사용자번호")
    private String userNo;

    @Column(name = "user_id", nullable = false, unique = true)
    @Schema(description = "사용자ID")
    private String userId;

    @Column(name = "user_name", nullable = false)
    @Schema(description = "사용자이름")
    private String userName;

    @Column(name = "user_pw", nullable = false)
    @Schema(description = "패스워드")
    private String userPw;

    @Column(name = "email", unique = true)
    @Schema(description = "이메일")
    private String email;

    @Column(name = "phone_number")
    @Schema(description = "핸드폰번호")
    private String phoneNumber;

    @Column(name = "auth_key")
    @Schema(description = "API 인증키")
    private String authKey;

    @Column(name = "last_login_dtime")
    @Schema(description = "마지막 로그인 일시")
    private LocalDateTime lastLoginDtime;

    @Column(name = "reg_no")
    @Schema(description = "등록자번호")
    private String regNo;

    @Column(name = "reg_dtime", updatable = false)
    @Schema(description = "등록일시")
    private LocalDateTime regDtime;

    @Column(name = "mod_no")
    @Schema(description = "수정자번호")
    private String modNo;

    @Column(name = "mod_dtime")
    @Schema(description = "수정일시")
    private LocalDateTime modDtime;
    
}
