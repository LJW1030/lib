package com.tracking.lib.dto.common;

import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "기본정보 공통코드 정보 모델")
public class CommonCodeDto implements Serializable {
    private static final long serialVersionUID = 6738623577798025594L;

    @Schema(description = "코드")
    private String cd;

    @Schema(description = "코드명")
    private String cdNm;

    @Schema(description = "그룹코드")
    private String grpCd;

    @Schema(description = "그룹코드조회키")
    private String grpSelKey;

    @Schema(description = "코드설명")
    private String cdDesc;

    @Schema(description = "코드옵션1")
    private String optCd1;

    @Schema(description = "코드옵션2")
    private String optCd2;

    @Schema(description = "코드옵션3")
    private String optCd3;

    @Schema(description = "코드옵션4")
    private String optCd4;

    @Schema(description = "코드옵션5")
    private String optCd5;

    @Schema(description = "코드옵션6")
    private String optCd6;
}
