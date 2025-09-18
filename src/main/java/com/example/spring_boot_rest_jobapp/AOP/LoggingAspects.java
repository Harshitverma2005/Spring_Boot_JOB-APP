package com.example.spring_boot_rest_jobapp.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {

    private  static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspects.class);

    //return type , class name (full name with pacjage) . method name (args)
    @Before("execution (* com.example.spring_boot_rest_jobapp.service.JobService.*(..))")
    public void getAddMethodCall(JoinPoint joinPoint)
    {
        LOGGER.info("Method Called "+joinPoint.getSignature().getName());
    }


    @After("execution (* com.example.spring_boot_rest_jobapp.service.JobService.*(..))")
    public void getMethodCall(JoinPoint joinPoint)
    {
        LOGGER.info("Method Executed "+joinPoint.getSignature().getName());
    }

    @AfterThrowing("execution (* com.example.spring_boot_rest_jobapp.service.JobService.*(..))")
    public void getMethodCrashed(JoinPoint joinPoint)
    {
        LOGGER.info("Method Successfully Crashed "+joinPoint.getSignature().getName());
    }
    @AfterReturning("execution (* com.example.spring_boot_rest_jobapp.service.JobService.*(..))")
    public void getMethodExecuted(JoinPoint joinPoint)
    {
        LOGGER.info("Method  SuccessFully Executed "+joinPoint.getSignature().getName());
    }


}



