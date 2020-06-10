package com.geekstudy.orange.apiResponse;

import lombok.Getter;

@Getter
public enum ResultCode {
    SUCCESS(1000, "success"),
    FAILED(1001, "failed"),
    VALIDATE_FAILED(1002, "Parameter verification failed"),
    ERROR(5000, "Unknown Errors");

    private final int code;
    private final String msg;
    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}