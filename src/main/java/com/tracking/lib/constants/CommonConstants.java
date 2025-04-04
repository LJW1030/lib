package com.tracking.lib.constants;

public class CommonConstants {
    public static final String SESSION_VALUE_NAME = "plusonSessVo";

    public static final String SESSION_VALUE_NAME_BO = "plusonSessBoVo";
    public static final String SESSION_VALUE_NAME_FO = "plusonSessFoVo";

    public static final String SESSION_COOKIE_NAME = "SESSION";
    public static final String X_AUTH_TOKEN = "X-Auth-Token";
    public static final String OAUTH2_TOKEN = "Authorization";
    public static final String MULTIPART_FORMDATA_TYPE = "multipart/form-data";
    public static final String DEFAULT_CHARACTER_ENCODING = "utf-8";
    public static final String X_SECRET_KEY = "X-Secret-Key";
    public static final int MAX_LGG_LENGTH = 1000;

    // Create Google OTP INFO
    public static final String GOOGLE_OTP_DOMAIN = "ucs.uzen.net";
    public static final String GOOGLE_OTP_GET_QR_ENCODED_KEY = "googleQREncodedKey";
    public static final String GOOGLE_OTP_GET_QR_BARCODE_URL = "googleQRBarcodeUrl";
    public static final String GOOGLE_CREATE_QR_URL = "http://chart.apis.google.com/chart?cht=qr&chs=200x200&chl=otpauth://totp/admin@aa&chld=H|0";

    // 날짜/시간 Type에 따라 사용할 상수 선언
    public static final String PATTERN_DATE = "yyyy-MM-dd";
    public static final String PATTERN_TIME = "HH:mm:ss";
    public static final String PATTERN_DATETIME = "yyyy-MM-dd'T'HH:mm:ss";

    // 확장자 코드
    public static final String EXCEL_EXT = ".xlsx";

}
