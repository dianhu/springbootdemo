package com.dianhu.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Time : 18-10-7 上午10:46
 * Author : hcy
 * Description :
 */
public class HelloAspect {

    public void beforeGetContent(){
        System.out.println("------before get content------");
    }

    public void afterGetContent(){
        System.out.println("------after get content--------");
    }

    public void aroundSetContent(ProceedingJoinPoint jp){
        try {
            String methodName = jp.getSignature().getName();
            System.out.println("-----before "+methodName+"-------");
            jp.proceed();
            System.out.println("-----after "+methodName+"-------");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
