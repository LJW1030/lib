package com.tracking.lib.constants;

public class ResultCodeConstants {

    // 처리 성공
    public static final String RESULT_SUCCESS_CODE = "0";
    public static final String RESULT_SUCCESS_MSG = "success";

    // 처리 실패
    public static final String RESULT_FAIL_CODE = "1";
    public static final String RESULT_FAIL_MSG = "fail";

    // 처리내용이 없을 때
    public static final String RESULT_NOT_PROCESSED_CODE = "NOT PROCESSED";
    public static final String RESULT_NOT_PROCESSED_MSG = "not processed";

    // 서버에러
    public static final String RESULT_SERVER_ERROR_CODE = "SERVER ERROR";
    public static final String RESULT_SERVER_ERROR_MSG = "internal server error";

    // 요청자료가 없을 때
    public static final String RESULT_NOTFOUND_EXCEPTION_CODE = "NOTFOUND_EXCEPTION";
    public static final String RESULT_NOTFOUND_EXCEPTION_MSG = "page not found";

    // 검증 실패 시
    public static final String RESULT_INVALID_EXCEPTION_CODE = "INVALID_EXCEPTION";
    public static final String RESULT_INVALID_EXCEPTION_MSG = "invalid exception";

    // 인증 실패 시
    public static final String RESULT_AUTHORIZATION_EXCEPTION_CODE = "AUTHORIZATION_EXCEPTION";
    public static final String RESULT_AUTHORIZATION_EXCEPTION_MSG = "authorization fail";

    // 로그인 실패 시
    public static final String RESULT_LOGIN_EXCEPTION_CODE = "LOGIN_EXCEPTION";
    public static final String RESULT_LOGIN_EXCEPTION_MSG = "login fail";

    // 파라메터 검증 에러
    public static final String RESULT_METHOD_INVALID_EXCEPTION_CODE = "INVALID_ARGUMENT_EXCEPTION";
    public static final String RESULT_METHOD_INVALID_EXCEPTION_MSG = "argument invalid exception";

    // 메일발송 실패 시
    public static final String RESULT_SEND_MAIL_FAIL_EXCEPTION_CODE = "MAIL SEND FAIL";
    public static final String RESULT_SEND_MAIL_FAIL_EXCEPTION_MSG = "mail send exception";

}
