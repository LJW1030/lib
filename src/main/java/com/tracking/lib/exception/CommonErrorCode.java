package com.tracking.lib.exception;


public enum CommonErrorCode implements ErrorCodable {

    // JWT 토큰 인증 오류
    AUTHENTICATION_FAIL_01("AUTHENTICATION_FAIL", "인증 토큰 오류"),

    AUTHENTICATION_FAIL_02("AUTHENTICATION_FAIL", "사용자가 존재하지 않음."),

    AUTHENTICATION_FAIL_03("AUTHENTICATION_FAIL", "인증키가 존재하지 않음."),

    AUTHENTICATION_FAIL_04("AUTHENTICATION_FAIL", "인증키가 일치하지 않음."),

    AUTHENTICATION_FAIL_05("AUTHENTICATION_FAIL", "인증기한 만료."),

    NOTFOUNDEXCEPTION_FAIL("NOT_FOUND_EXCEPTION", "요청한 정보없음"),

    // 실행환경(서버, DB 등) 에서 오류가 발생한 경우에는 ERROR
    ERROR_SYSTEM_FAIL("ERROR_SYSTEM_FAIL", "시스템_오류가_발생하였습니다."),

    ERROR_SYSTEM_CHECK("ERROR__SYSTEM_CHECK", "시스템_점검중입니다."),

    SPRING_APPLICATION_FAIL("SPRING_APPLICATION_FAIL", "Spring의 ApplicationContext초기화 실패하였습니다."),

    // 파일저장 오류
    FILE_UPLOAD_FAIL("FILE_UPLOAD_FAIL", "파일 저장시 오류가 발생하였습니다."),

    // 파일다운로드 오류
    FILE_DOWNLOAD_FAIL("FILE_UPLOAD_FAIL", "파일 다운로드 오류가 발생하였습니다."),

    // 파일이 없을 경우
    FILE_NOT_FOUND_FAIL("FILE_NOT_FOUND_FAIL", "파일이 존재하지 않습니다."),

    // 업로드 파일수 제한되었을 경우
    FILE_ALLOW_COUNT_FAIL("FILE_ALLOW_COUNT_FAIL", "업로드 가능한 파일 수보다 많습니다."),

    // 업로드 파일 사이지 제한되었을 경우
    FILE_ALLOW_SIZE_FAIL("FILE_ALLOW_SIZE_FAIL", "업로드 가능한 파일 사이즈보다 큽니다."),

    // 업로드 파일 확장자 제한되었을 경우
    FILE_ALLOW_EXTENTION_FAIL("FILE_ALLOW_EXTENTION_FAIL", "업로드 가능한 확장자 파일이 아닙니다."),

    // 파일이동 실패 오류
    FILE_MOVE_FAIL("FILE_MOVE_FAIL", "파일복사 실패하였습니다."),

    // 파일읽기 오류
    FILE_READ_FAIL("FILE_UPLOAD_FAIL", "파일 읽기 오류가 발생하였습니다."),

    // 검색기간 미입력
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
    FAIL_NO_JOBNAME("FAIL_NO_JOBNAME", "JobName이 지정되지 않았습니다.");

    private final String errCode;
    private final String message;

    CommonErrorCode(String errCode, String message) {
        this.errCode = errCode;
        this.message = message;
    }

    @Override
    public String getErrCode() {
        return this.errCode;
    }

}
