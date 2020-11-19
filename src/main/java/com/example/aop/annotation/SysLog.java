package com.example.aop.annotation;
import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface SysLog {
    String methodName() default "";
}
