package com.geekstudy.orange.ogException;

import lombok.Getter;

@Getter
public class APIException extends RuntimeException{
    private final int code;
    private final String msg;

    public APIException() {
        this(1001, "接口错误");
    }

    public APIException(String msg) {
        this(1001, msg);
    }

    public APIException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
