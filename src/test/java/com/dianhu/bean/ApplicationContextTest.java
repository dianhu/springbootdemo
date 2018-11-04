package com.dianhu.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Time : 18-9-15 上午9:57
 * Author : hcy
 * Description :
 */
public class ApplicationContextTest {

    @Test
    public void testFactoryBean() {
        String configLocation = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
        System.out.println("helloFactory -> " + applicationContext.getBean("helloFactory"));
        System.out.println("&helloFactory -> " + applicationContext.getBean("&helloFactory"));
    }

    @Test
    public void testBeanPostProcessor() {
        String configLocation = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }

    @Test
    public void testLookUpMethod(){
        String configLocation = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
        NewsProvider newsProvider = (NewsProvider) applicationContext.getBean("newsProvider");
        System.out.println("newsProvider -> " + newsProvider);
        System.out.println("news 1 -> " + newsProvider.getNews());
        System.out.println("news 2 -> " + newsProvider.getNews());
    }

    @Test
    public void testAutowire() {
        String configLocation = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
        ServiceB serviceB = applicationContext.getBean("serviceB", ServiceB.class);
        serviceB.sayHello();
    }

}
