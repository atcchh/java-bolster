package bean.config1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by BJY on 2014/7/6.
 */
//@Configuration
public class TransactionDefinedConfig {
    @Bean
    public TestService getTestService() {
        return new TestService();
    }
}
