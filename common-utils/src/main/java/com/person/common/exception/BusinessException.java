package com.person.common.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
    private final int status;
    private final String error;

    public BusinessException(int status, String error, String message) {
        super(message);
        this.status = status;
        this.error = error;
    }

    public BusinessException(String message) {
        this(400, "Bad Request", message);
    }
} 