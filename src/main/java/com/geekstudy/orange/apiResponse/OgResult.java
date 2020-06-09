package com.geekstudy.orange.apiResponse;

import lombok.Getter;

@Getter
public class OgResult<T> {
    private final int code;
    private final String message;
    private final T data;

    public OgResult(T data){
        this(ResultCode.SUCCESS, data);
    }

    public OgResult(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMsg();
        this.data = data;
    }
}