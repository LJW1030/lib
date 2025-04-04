package com.tracking.lib.exception;

public class CommonRuntimeException extends AbstractRuntimeException {
	private static final long serialVersionUID = 1L;

	public CommonRuntimeException(String message) {
		super(message);
	}

	public CommonRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public CommonRuntimeException(String code, String message) {
		super(code, message);
	}

	public CommonRuntimeException(String code, String message, Throwable err) {
		super(code, message, err);
	}

	public CommonRuntimeException(ErrorCodable errCodable, String... args) {
		super(errCodable, args);
	}
}
