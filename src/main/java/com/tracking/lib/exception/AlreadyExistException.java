package com.tracking.lib.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlreadyExistException extends AbstractRuntimeException {

    private static final long serialVersionUID = 2729310990113247969L;

    public AlreadyExistException(String message) {
        super(message);
    }

    public AlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public AlreadyExistException(String code, String message) {
        super(code, message);
    }

    public AlreadyExistException(String code, String message, Throwable err) {
        super(code, message, err);
    }

    public AlreadyExistException(ErrorCodable errCodable, String... args) {
        super(errCodable, args);
    }
}
