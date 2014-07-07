package bean.config1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by BJY on 2014/7/6.
 */
public class SpringConfigurationExample {
    public static void main(String[] args) {
//        setAnnotationClass();
        userConfigurationScan();
    }
    public static void setAnnotationClass() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TransactionDefinedConfig.class);
        TestService testService = context.getBean(TestService.class);
        testService.print();
    }
    public static void userConfigurationScan() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("bean.config1");
        context.refresh();
        TestService testService = context.getBean(TestService.class);
        testService.print();
    }
}
