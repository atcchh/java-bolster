package bean.lifecycle;
import static utility.MethodUtils.printConstract;
import static utility.MethodUtils.printMethod;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ResourceLoader;

public class TestWEBService1 extends TestService {
    public TestWEBService1(){
        printConstract(TestWEBService1.class);
    }
    public void init(){
        printMethod(TestWEBService1.class, "init");
    }
    @Override
    public void setBeanName(String arg0) {
        printMethod(TestWEBService1.class,"setBeanName", arg0.getClass());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        printMethod(TestWEBService1.class,"afterPropertiesSet");
        
    }


    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        printMethod(TestWEBService1.class,"setApplicationContext",ApplicationContext.class);
        
    }

    @Override
    public void setMessageSource(MessageSource arg0) {
        printMethod(TestWEBService1.class,"setMessageSource",MessageSource.class);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
        printMethod(TestWEBService1.class,"setApplicationEventPublisher", ApplicationEventPublisher.class);
        
    }

    @Override
    public void setResourceLoader(ResourceLoader arg0) {
        printMethod(TestWEBService1.class,"setResourceLoader",ResourceLoader.class);
    }

    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
         printMethod(TestWEBService1.class,"setBeanFactory", BeanFactory.class);
        
    }

    @Override
    public void setBeanClassLoader(ClassLoader arg0) {
        printMethod(TestWEBService1.class,"setBeanClassLoader",ClassLoader.class);
    }
    @PostConstruct
    public void postConstract1() {
        printMethod(TestWEBService1.class,"postConstract1");
    }


    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
        printMethod(TestWEBService1.class,"postProcessAfterInitialization", Object.class, String.class);
        return arg0;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
        printMethod(TestWEBService1.class,"postProcessBeforeInitialization",  Object.class, String.class);
        return arg0;
    }
    
}
