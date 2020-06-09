package com.geekstudy.orange.ogException;

import com.geekstudy.orange.apiResponse.OgResult;
import com.geekstudy.orange.apiResponse.ResultCode;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = {"com.geekstudy.orange.controller"})
public class ExceptionControllerAdvice {
    @ExceptionHandler(APIException.class)
    public OgResult<String> APIExceptionHandler(APIException e) {
        return new OgResult<>(ResultCode.FAILED, e.getMsg());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public OgResult<String> ArgsValid(MethodArgumentNotValidException e){
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
        return new OgResult<>(ResultCode.VALIDATE_FAILED, objectError.getDefaultMessage());
    }
}
