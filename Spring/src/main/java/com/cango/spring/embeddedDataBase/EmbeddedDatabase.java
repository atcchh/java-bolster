package com.cango.spring.embeddedDataBase;

import com.cango.spring.embeddedDataBase.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by caoyanfei079 on 7/16/14.
 */
@Configuration
@EnableTransactionManagement
public class EmbeddedDatabase {
    // database
    @Bean
    public DataSource getDataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        org.springframework.jdbc.datasource.embedded.EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2).addScript("db/script/createCustomerTable.sql").build();
        return db;
    }
    @Bean
    public JdbcTemplate getJDBCTemplate() {
        return new JdbcTemplate(getDataSource());
    }

//    @Bean
//    public TargetSource getTargetSource() {
//        return new HotSwappableTargetSource(null);
//    }
    public static void main(String[] argus) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmbeddedDatabase.class);
        applicationContext.scan("com.cango.spring.*");
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        customerService.createNewCustomer("cango",19);
        System.out.println(customerService.getCustomers());
    }
}
