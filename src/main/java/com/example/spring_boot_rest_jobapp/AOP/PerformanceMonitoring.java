package com.example.spring_boot_rest_jobapp.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitoring {

    private final static Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitoring.class);


    @Around("execution (* com.example.spring_boot_rest_jobapp.service.JobService.*(..))")
    public Object getAddMethodCall(ProceedingJoinPoint joinPoint) throws Throwable
    {
        long start_time = System.currentTimeMillis();

        Object obj = joinPoint.proceed();

        long end_time = System.currentTimeMillis();

        LOGGER.info("Time Taken is " + (end_time - start_time) + " ms and the Method Called is "+joinPoint.getSignature().getName()+" in PerformenceMonitoring aspect Class");

        return obj;
    }
}
