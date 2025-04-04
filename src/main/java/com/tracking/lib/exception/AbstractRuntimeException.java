package com.tracking.lib.exception;

public abstract class AbstractRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -12024597224886065L;
    private String code;
    private String message;

    protected AbstractRuntimeException(String message) {
        super(message);
        this.message = message;
    }

    protected AbstractRuntimeException(String code, String message) {
        this(message);
        this.code = code;
    }

    protected AbstractRuntimeException(String message, Throwable err) {
        super(message, err);
        this.message = message;
    }

    protected AbstractRuntimeException(String code, String message, Throwable err) {
        this(message, err);
        this.code = code;
    }

    protected AbstractRuntimeException(ErrorCodable errCodable, String... args) {
        this(errCodable.getErrCode(), errCodable.getMessage(args));
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}