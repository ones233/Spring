package com.DIY;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("===========方法执行前=========");
    }
    @After("execution(* com.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("===========方法执行后=========");
    }

    //在环绕增强中，可以给定一个参数，代表我们需要获取处理切入的点
    @Around("execution(* com.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Signature signature = jp.getSignature();//获得签名
        System.out.println("signature:"+signature);
        //执行方法
        Object proceed = jp.proceed();
        System.out.println(proceed);
        System.out.println("环绕后");

    }
}
