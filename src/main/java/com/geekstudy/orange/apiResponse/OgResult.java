package com.geekstudy.orange.apiResponse;

public class OgResult<T> {
    private int code;
    private String message;
    private T data;
    public OgResult(T data){
        this(ResultCode.SUCCESS, data);
    }

    public OgResult(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMsg();
        this.data = data;
    }
}
