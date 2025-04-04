package com.tracking.lib.exception;

public interface ErrorCodable {
    String getErrCode();

    String getMessage(String... args);
}