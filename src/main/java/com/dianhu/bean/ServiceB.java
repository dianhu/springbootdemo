package com.dianhu.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Time : 18-10-7 下午5:03
 * Author : hcy
 * Description :
 */
public class ServiceB {
    @Autowired
    private ServiceA serviceA;

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void sayHello(){
        serviceA.sayHello();
    }
}
