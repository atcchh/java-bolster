package com.lufax.test.utils;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;

import com.lufax.test.TestWEBService1;

public class MethodUtils {
    private Class[] clazzList = {BeanNameAware.class, BeanClassLoaderAware.class,BeanFactoryAware.class,ResourceLoaderAware.class,ApplicationEventPublisherAware.class,MessageSourceAware.class,ApplicationContextAware.class,BeanPostProcessor.class,InitializingBean.class};  
    private static int invokeIndex = 1;  
    public static void printMethod(Class clazz, String methodName, Class ... parameterList ){  
        System.out.println("" + invokeIndex + " : " + clazz + "---->" +getInterface(clazz,methodName, parameterList) + "(" + Arrays.asList(parameterList)+ ")");  
        invokeIndex++;  
    }  
    public static String getInterface(Class clazz,String methodName, Class ... parameterList){  
        Class[] interfaceList = clazz.getInterfaces();  
        for(Class temp : interfaceList) {  
            try {  
                Method method = temp.getMethod(methodName, parameterList);  
                return temp.getSimpleName() + "." + method.getName();  
            }catch(Exception e) {  
            }  
        }  
        return clazz.getSimpleName() + "." +methodName;  
    }  
    public static <T>void printConstract(Class<T> clazz) {  
        System.out.println("" + invokeIndex + " : " + clazz + "---->" + clazz.getSimpleName() + "()");  
        invokeIndex++;  
    }  
    public static void main(String[] args) {  
        System.out.println(getInterface(TestWEBService1.class, "setBeanName",String.class));  
    } 
}
