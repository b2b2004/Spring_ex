package com.example.springaop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AspectV1 {

    @Around("execution(* com.example.springaop.order..*(..))")
    public Object dolog(ProceedingJoinPoint joinPoint) throws  Throwable{
        log.info("[log] {}", joinPoint.getSignature()); // join 포인트 시그니처
        return joinPoint.proceed();
    }
}
