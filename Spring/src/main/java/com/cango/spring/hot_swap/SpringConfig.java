package com.cango.spring.hot_swap;

import com.cango.spring.hot_swap.service.CustomerService;
import com.cango.spring.hot_swap.service.MallService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by caoyanfei079 on 7/16/14.
 */
@Configuration
public class SpringConfig {
    @Bean
    public CustomerService getCustomerService() {
        return new CustomerService();
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        applicationContext.scan("com.cango.spring.hot_swap.service");
        MallService mallService = applicationContext.getBean(MallService.class);
        mallService.list();
    }
}
