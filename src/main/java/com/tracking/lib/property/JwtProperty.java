package com.tracking.lib.property;

public interface JwtProperty {
    String SECRET = "XSuZWxPmuaIQqmzeVhtMwQkgtBjWHcryIQwoAigpTdBeBhPqdKMeRJshBtnbmKoxVthRsFjLyBTdNqjQEYeMRLhLhujOWRqijeKTwObowLauIWKAUKuMcieQhKIWiQyjbSrKZRxxFuRFDXbbcvLkFbWuOoVVxeYUeuacIMoMNzmYscAdEZvypBAvBjukkgTOZWsgiYgDphiIVnLEZvGdzKoCAtGIZYIKyuJibvXcjPnyKayJzfkEvXMHBOKhohiV";
    long ACCESS_EXPIRATION_TIME = 1000 * 60 * 60 * 24; // 60분 , 24시간, 30일
    long REFRESH_EXPIRATION_TIME = 1000 * 60 * 60 * 24 * 30; // 1개월
    // long FRONT_ACCESS_EXPIRATION_TIME = 1000 * 60 * 60 * 24 * 30 * 12; // 12개월
    long FRONT_ACCESS_EXPIRATION_TIME = 1000 * 60 * 1; // 12개월
    long FRONT_REFRESH_EXPIRATION_TIME = 1000 * 60 * 60 * 24 * 30; // 1개월
    String TOKEN_PREFIX = "Bearer ";
    String HEADER_STRING = "Authorization";
}
