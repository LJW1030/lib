package com.tracking.lib.dto.login;

import java.time.LocalDateTime;

import com.tracking.lib.domain.LoginHist;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "LoginHistVo", description = "LoginHist 정보 응답모델")
public class LoginHistVo {

    @Schema(description = "사용자번호")
    private String userNo;

    @Schema(description = "로그인일시")
    private LocalDateTime loginDtime;

    @Schema(description = "사용자ID")
    private String userId;

    @Schema(description = "로그인IP주소")
    private String loginIpAddr;

    @Schema(description = "로그인채널코드")
    private String loginChnlCd;
    
    public LoginHist toLoginHist() {
        return LoginHist.builder()
            .userNo(this.userNo)
            .userId(this.userId)
            .loginDtime(this.loginDtime)
            .loginIpAddr(this.loginIpAddr)
            .loginChnlCd(this.loginChnlCd)
            .build();
    }

}
