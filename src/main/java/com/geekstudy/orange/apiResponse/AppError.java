package com.geekstudy.orange.apiResponse;

import lombok.Getter;

@Getter
public enum AppError{
    EMAIL_ERROR(1066, "邮箱地址格式错误"),
    TEACHER_NAMED_FORMAT_ERROR(1077, "教师名字命名错误");

    private final int code;
    private final String msg;
    AppError(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
