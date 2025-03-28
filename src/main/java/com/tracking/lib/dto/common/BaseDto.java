package com.tracking.lib.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "기초 모델 데이터")
@Data
public class BaseDto {

    @Schema(description = "결과")
    public boolean result;

    @Schema(description = "결과코드")
    public String resultCode;

    @Schema(description = "결과메시지")
    public String resultMsg;

    @Schema(description = "에러코드")
    public String errorCode;

    @Schema(description = "에러메시지")
    public String errorMsg;

}
