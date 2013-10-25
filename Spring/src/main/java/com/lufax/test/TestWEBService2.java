package com.lufax.test;

import static com.lufax.test.utils.MethodUtils.printConstract;
import static com.lufax.test.utils.MethodUtils.printMethod;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;


public class TestWEBService2 extends TestService implements BeanNameAware, BeanClassLoaderAware,BeanFactoryAware,ResourceLoaderAware,ApplicationEventPublisherAware,MessageSourceAware,ApplicationContextAware,BeanPostProcessor,InitializingBean{
    public TestWEBService2(){
        super();
        printConstract(TestWEBService2.class);
    }
    public void init(){
        printMethod(TestWEBService2.class, "init");
    }
    @Override
    public void setBeanName(String arg0) {
        printMethod(TestWEBService2.class,"setBeanName", arg0.getClass());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        printMethod(TestWEBService2.class,"afterPropertiesSet");
        
    }

    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        printMethod(TestWEBService2.class,"setApplicationContext",ApplicationContext.class);
        
    }

    @Override
    public void setMessageSource(MessageSource arg0) {
        printMethod(TestWEBService2.class,"setMessageSource",MessageSource.class);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
        printMethod(TestWEBService2.class,"setApplicationEventPublisher", ApplicationEventPublisher.class);
        
    }

    @Override
    public void setResourceLoader(ResourceLoader arg0) {
        printMethod(TestWEBService2.class,"setResourceLoader",ResourceLoader.class);
    }

    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
         printMethod(TestWEBService2.class,"setBeanFactory", BeanFactory.class);
        
    }

    @Override
    public void setBeanClassLoader(ClassLoader arg0) {
        printMethod(TestWEBService2.class,"setBeanClassLoader",ClassLoader.class);
    }
    @PostConstruct
    public void postConstract2() {
        printMethod(TestWEBService2.class,"postConstract2");
    }

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
        printMethod(TestWEBService2.class,"postProcessAfterInitialization", Object.class, String.class);
        return arg0;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
        printMethod(TestWEBService2.class,"postProcessBeforeInitialization",  Object.class, String.class);
        return arg0;
    }
    
}