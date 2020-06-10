package com.geekstudy.orange.annotation;

import com.geekstudy.orange.apiResponse.AppError;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExceptionCode {
    AppError appError();
}