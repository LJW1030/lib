package com.tracking.lib.exception;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;

public class ErrorDetails {
    private HttpStatus status;
    private String message;
    private List<String> errors;

    public ErrorDetails(HttpStatus status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

    public ErrorDetails(HttpStatus status, String message, List<String> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ErrorDetails(HttpStatus status, String message, String error) {
        super();
        this.status = status;
        this.message = message;
        errors = Arrays.asList(error);
    }
}
