package com.dianhu.aware;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Time : 18-11-4 下午8:53
 * Author : hcy
 * Description :
 */
@Component
public class AwareTest implements ApplicationContextAndBeanFactoryAware {

    @Override
    public void setApplicationContextAndBeanFactory(ApplicationContext context, BeanFactory beanFactory) {
        System.out.println("======>ApplicationContext:" + context.getClass().getSimpleName() + ",BeanFactory:" + beanFactory.getClass().getSimpleName());
    }

}
