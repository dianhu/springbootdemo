package com.dianhu.aware;

import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

/**
 * Time : 18-11-4 下午8:36
 * Author : hcy
 * Description : 仿照ApplicationContextAware写一个Aware和对应的BeanPostProcessor
 */
public interface ApplicationContextAndBeanFactoryAware extends Aware {
    void setApplicationContextAndBeanFactory(ApplicationContext context, BeanFactory beanFactory);
}
