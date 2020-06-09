package com.geekstudy.orange.ogException;

import com.geekstudy.orange.annotation.ExceptionCode;
import com.geekstudy.orange.apiResponse.OgResult;
import com.geekstudy.orange.apiResponse.ResultCode;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.reflect.Field;

@RestControllerAdvice(basePackages = {"com.geekstudy.orange.controller"})
public class ExceptionControllerAdvice {
    @ExceptionHandler(APIException.class)
    public OgResult<String> APIExceptionHandler(APIException e) {
        return new OgResult<>(ResultCode.FAILED, e.getMsg());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public OgResult<String> ArgsValid(MethodArgumentNotValidException e) throws NoSuchFieldException {
        //从异常对象中拿到错误信息
        String defaultMessage = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();

        //参数的Class对象，准备通过字段名称获取Field对象
        Class<?> parameterType = e.getParameter().getParameterType();
        String fieldName = e.getBindingResult().getFieldError().getField();
        Field field = parameterType.getDeclaredField(fieldName);

        //获取Field字段上的自定义注解
        ExceptionCode annotation = field.getAnnotation(ExceptionCode.class);

        // 有注解的话就返回注解的响应信息
        if (annotation != null) {
            return new OgResult<>(annotation.value(),annotation.message(),defaultMessage);
        }

        // 如果字段没有自定义注解就直接提取错误提示信息进行返回
        return new OgResult<>(ResultCode.VALIDATE_FAILED, defaultMessage);
    }
}
