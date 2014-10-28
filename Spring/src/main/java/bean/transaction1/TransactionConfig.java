package bean.transaction1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.activation.DataSource;

/**
 * Created by BJY on 2014/7/6.
 */
@Configuration
@EnableTransactionManagement
public class TransactionConfig {
    // database
//    @Bean
//    public DriverManagerDataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
//        dataSource.setDriverClassName("org.h2.Driver");
//        return dataSource;
//    }
    @Bean
    public javax.sql.DataSource getDataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        org.springframework.jdbc.datasource.embedded.EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2).addScript("db/script/createCustomerTable.sql").build();
        return db;
    }
    @Bean(name="TransactionManager1")
    public PlatformTransactionManager txManager1() {
        return new DataSourceTransactionManager(getDataSource());
    }
    @Bean(name="TransactionManager2")
    public PlatformTransactionManager txManager2() {
        return new DataSourceTransactionManager(getDataSource());
    }
    @Bean
    public JdbcTemplate getJDBCTemplate() {
        return new JdbcTemplate(getDataSource());
    }
}
