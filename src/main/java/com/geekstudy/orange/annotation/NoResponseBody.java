package com.geekstudy.orange.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * description:自定义注解，在controller的方法上添加此注解，将直接返回请求体，不做包装
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})//表明该注解只能放在方法上
public @interface NoResponseBody {
}
