package com.tracking.lib.dto.common;

import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "기본정보 행정기관코드 모델")
@Data
public class CommonOrgCodeDto implements Serializable {

    private static final long serialVersionUID = 6738623577798025594L;

    @Schema(description = "기관코드")
    private String orgCd;

    @Schema(description = "전체기관명")
    private String fullOrgNm;

    @Schema(description = "기관명")
    private String lowOrgNm;

    @Schema(description = "차수")
    private String dgr;

    @Schema(description = "순위")
    private String rank;

    @Schema(description = "차상위기관코드")
    private String nextUprOrgCd;

    @Schema(description = "최상위기관코드")
    private String topUprOrgCd;

    @Schema(description = "코드명")
    private String reprOrgCd;
}
