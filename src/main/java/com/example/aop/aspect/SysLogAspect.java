package com.example.aop.aspect;

import com.example.aop.annotation.SysLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(0)
@Component
public class SysLogAspect {



    @Pointcut("@annotation(com.example.aop.annotation.SysLog)")
    public void methodName() {
    }

    @Around(value = "@annotation(sysLog)")
    public void process(ProceedingJoinPoint pointcut, SysLog sysLog) throws Throwable {
        System.out.println("注解注释的名称"+sysLog.methodName());
        System.out.println(pointcut.getSignature().getDeclaringType().getSimpleName());
        pointcut.proceed();
        System.out.println("ANNOTATION login success");

    }
}
