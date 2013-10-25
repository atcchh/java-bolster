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

public class TestService implements BeanNameAware, BeanClassLoaderAware,BeanFactoryAware,ResourceLoaderAware,ApplicationEventPublisherAware,MessageSourceAware,ApplicationContextAware,BeanPostProcessor,InitializingBean{  
    
    public TestService(){  
        printConstract(TestService.class);  
    }  
    @PostConstruct  
    public void postConstract() {  
        printMethod(TestService.class,"postConstract");  
    }  
    @Override  
    public void setBeanName(String arg0) {  
        printMethod(TestService.class,"setBeanName", arg0.getClass());  
    }  
  
    @Override  
    public void afterPropertiesSet() throws Exception {  
        printMethod(TestService.class,"afterPropertiesSet");  
          
    }  
  

  
    @Override  
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {  
        printMethod(TestService.class,"setApplicationContext",ApplicationContext.class);  
          
    }  
  
    @Override  
    public void setMessageSource(MessageSource arg0) {  
        printMethod(TestService.class,"setMessageSource",MessageSource.class);  
    }  
  
    @Override  
    public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {  
        printMethod(TestService.class,"setApplicationEventPublisher", ApplicationEventPublisher.class);  
          
    }  
  
    @Override  
    public void setResourceLoader(ResourceLoader arg0) {  
        printMethod(TestService.class,"setResourceLoader",ResourceLoader.class);  
    }  
  
    @Override  
    public void setBeanFactory(BeanFactory arg0) throws BeansException {  
         printMethod(TestService.class,"setBeanFactory", BeanFactory.class);  
          
    }  
  
    @Override  
    public void setBeanClassLoader(ClassLoader arg0) {  
        printMethod(TestService.class,"setBeanClassLoader",ClassLoader.class);  
    }  
  
    @Override  
    public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {  
        printMethod(TestService.class,"postProcessAfterInitialization", Object.class, String.class);  
        return arg0;  
    }  
  
    @Override  
    public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {  
        printMethod(TestService.class,"postProcessBeforeInitialization",  Object.class, String.class);  
        return arg0;  
    }  
}