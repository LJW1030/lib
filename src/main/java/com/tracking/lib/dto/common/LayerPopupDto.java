package com.tracking.lib.dto.common;

import java.util.List;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Schema(name = "LayerPopupVo", description = "레이어팝업 정보 전달모델")
public class LayerPopupDto {

    @Schema
    private String popHeaderType;

    @Schema
    private String popSearchKw;

    @Schema
    private List<String> popSearchKwList;

    @Schema
    private String popSearchDtmTp;

    @Schema
    private String popCheckNo;

    @Schema
    private String callbackFunctionNm;
}
