package com.dianhu.aop;

import com.dianhu.bean.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Time : 18-10-7 上午10:59
 * Author : hcy
 * Description :
 */
public class AopTest {
    @Test
    public void testAop() {
        String configLocation = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
        Hello hello = (Hello)applicationContext.getBean("hello");
        hello.setContent("hello world");
        hello.getContent();
    }
}
