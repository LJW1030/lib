package com.tracking.lib.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "사용자 코드 정보 모델")
public class CustomCodeDto {

    @Schema(description = "코드")
    private String cd;

    @Schema(description = "코드명")
    private String cdNm;

}
