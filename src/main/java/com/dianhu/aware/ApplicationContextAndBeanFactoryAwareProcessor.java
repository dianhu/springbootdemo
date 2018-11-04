package com.dianhu.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Time : 18-11-4 下午8:42
 * Author : hcy
 * Description :
 */
@Component
public class ApplicationContextAndBeanFactoryAwareProcessor implements BeanPostProcessor,ApplicationContextAware,BeanFactoryAware {

    ApplicationContext applicationContext;
    BeanFactory beanFactory;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof ApplicationContextAndBeanFactoryAware){
            ((ApplicationContextAndBeanFactoryAware) bean).setApplicationContextAndBeanFactory(applicationContext,beanFactory);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
