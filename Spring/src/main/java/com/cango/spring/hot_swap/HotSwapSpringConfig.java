package com.cango.spring.hot_swap;

import com.cango.spring.hot_swap.service.CustomerService;
import com.cango.spring.hot_swap.service.CustomerServiceMock;
import com.cango.spring.hot_swap.service.MallService;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.target.HotSwappableTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by caoyanfei079 on 7/16/14.
 */
@Configuration
@ImportResource("spring_config/hot_swap/hot_swap_1.xml")
@EnableTransactionManagement
public class HotSwapSpringConfig {

    @Bean
    public DataSource getDataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        org.springframework.jdbc.datasource.embedded.EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2).addScript("db/script/createCustomerTable.sql").build();
        return db;
    }
    @Bean(name="TransactionManager1")
    public PlatformTransactionManager txManager1() {
        return new DataSourceTransactionManager(getDataSource());
    }
    @Bean(name="customerService")
    public CustomerService getCustomerService() {
        return new CustomerService();
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HotSwapSpringConfig.class);
        applicationContext.scan("com.cango.spring.hot_swap.service");
//        applicationContext.refresh();

        System.out.println("before hot swap:");
        System.out.println();
        MallService mallService = applicationContext.getBean(MallService.class);
//        mallService.list();
        System.out.println("hot swap : ");
        System.out.println();

        HotSwappableTargetSource beanSwap = applicationContext.getBean(HotSwappableTargetSource.class);
        CustomerService mock = (CustomerService)beanSwap.swap(new CustomerServiceMock());
        mock.buy();
        mallService.list();
        System.out.println("release hot swap : ");
        System.out.println();
        beanSwap.releaseTarget(mock);
        mallService.list();
    }
}
