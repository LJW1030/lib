package com.tracking.lib.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvalidException extends AbstractRuntimeException {

    private static final long serialVersionUID = 2729310990113247969L;

    public InvalidException(String message) {
        super(message);
    }

    public InvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidException(String code, String message) {
        super(code, message);
    }

    public InvalidException(String code, String message, Throwable err) {
        super(code, message, err);
    }

    public InvalidException(ErrorCodable errCodable, String... args) {
        super(errCodable, args);
    }
}
