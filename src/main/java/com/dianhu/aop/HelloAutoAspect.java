package com.dianhu.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Time : 18-10-7 下午12:56
 * Author : hcy
 * Description :
 */
@Aspect
public class HelloAutoAspect {
    //切点的方法传入通知中去
    @Pointcut("execution(* com.dianhu.bean.Hello.setContent(String)) && args(content))")
    public void setContent(String content){}

    @AfterReturning("setContent(content)")
    public void afterRetSetContent(String content){
        System.out.println("-----setContent(String content)已返回，传入的参数为："+content);
    }
}
