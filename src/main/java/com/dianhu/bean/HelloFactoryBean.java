package com.dianhu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Time : 18-9-15 上午9:48
 * Author : hcy
 * Description :
 */
public class HelloFactoryBean implements FactoryBean<Hello> {

    @Override
    public Hello getObject() throws Exception {
        Hello hello = new Hello();
        hello.setContent("hello");
        return hello;
    }

    @Override
    public Class<?> getObjectType() {
        return Hello.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
