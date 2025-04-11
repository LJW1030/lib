package com.tracking.lib.domain;

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

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="login_hist")
@Schema(name = "LoginHist 모델", description = "LoginHist 모델 정보")
public class LoginHist {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    @Schema(description = "사용자번호")
    private String userNo;

	@Column
    @Schema(description = "로그인일시")
    private LocalDateTime loginDtime;

	@Column
    @Schema(description = "사용자ID")
    private String userId;

	@Column
    @Schema(description = "로그인IP주소")
    private String loginIpAddr;

	@Column
    @Schema(description = "로그인채널코드")
    private String loginChnlCd;
	
	@Column(name = "reg_no")
    @Schema(description = "등록자번호")
    private String regNo;

    @Column(name = "reg_dtime", updatable = false)
    @Schema(description = "등록일시")
    private LocalDateTime regDtime;

}