package com.tracking.lib.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotFoundException extends AbstractRuntimeException {

    private static final long serialVersionUID = 2729310990113247969L;

    protected int statusCode = 404;

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(String code, String message) {
        super(code, message);
    }

    public NotFoundException(String code, String message, Throwable err) {
        super(code, message, err);
    }

    public NotFoundException(ErrorCodable errCodable, String... args) {
        super(errCodable, args);
    }

}
