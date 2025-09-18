package com.example.spring_boot_rest_jobapp.AOP;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Validation {

    private final static Logger LOGGER = LoggerFactory.getLogger(Validation.class);


    @Around("execution (* com.example.spring_boot_rest_jobapp.service.JobService.*(..))  && args(postID)")
    public Object getAddMethodCall(ProceedingJoinPoint joinPoint,int postID) throws Throwable
    {

        if(postID < 0)
        {
            LOGGER.info("PostID is Negative ... Working on it ");

            postID = -postID;

            LOGGER.info("PostID is Updated SuccessFully");
        }

        Object obj = joinPoint.proceed(new Object[]{postID});

        return obj;
    }
}
