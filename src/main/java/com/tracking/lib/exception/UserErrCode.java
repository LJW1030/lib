package com.tracking.lib.exception;

public enum UserErrCode implements ErrorCodable {

    // 검색기간 미입력
    DATE_INVALID_EMPTY("DATE_INVALID_EMPTY", "일자가 입력되지 않았습니다."),

    DATE_INVALID_FAIL("DATE_INVALID_FAIL", "시작일과 종료일이 입력되지 않았습니다."),

    DATE_INVALID_YEAR_FAIL("DATE_INVALID_YEAR_FAIL", "검색기간은 1년을 조과할 수 없습니다."),

    // 쿠키 생성오류
    COOKIE_INVALID_CREATE_FAIL("COOKIE_INVALID_FAIL", "쿠키생성 오류입니다."),

    // 사용자 요청에 문제가 있어 실행에 실패한 경우에는 FAIL
    FAIL_INVALID("FAIL_INVALID", "요청한(%1) 입력값이 유효하지 않습니다."),

    FAIL_REQUIRED_FIELD("FAIL_REQUIRED_FIELD", "%1는 필수 입력 항목입니다."),

    FAIL_DUPLICATED("FAIL_DUPLICATED", "%1는 이미 등록된 정보입니다."),

    FAIL_NOT_EXIST("FAIL_NOT_EXIST", "대상(%1) 정보가 존재하지 않습니다."),

    FAIL_NO_AUTH("FAIL_NO_AUTH", "해당 정보(%1)에 대한 권한이_없습니다."),

    // batch 관련
    FAIL_NO_JOBNAME("FAIL_NO_JOBNAME", "JobName이 지정되지 않았습니다."),

    // 날짜입력 관련
    INVALID_DATE_JSON_FORMAT("INVALID_DATE_JSON_FORMAT", "날짜 입력 형식을 확인해주세요. ex) 2024-01-01"),

    INVALID_DATE_VALUE("INVALID_DATE_VALUE", "약관 시행일시를 확인해주세요.");

    private final String errCode;
    private final String message;

    UserErrCode(String errCode, String message) {
        this.errCode = errCode;
        this.message = message;
    }

    @Override
    public String getErrCode() {
        return this.errCode;
    }

	@Override
	public String getMessage(String... args) {
		// TODO Auto-generated method stub
		return null;
	}

}
