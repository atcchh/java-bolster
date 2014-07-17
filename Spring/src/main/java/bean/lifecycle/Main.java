package bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] argu) {
        System.out.println("********************************************");
        System.out.println("test the spring object load sequence");
        System.out.println("********************************************");
        System.out.println("");
        System.out.println("");
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:lifecycle.xml"}, true);
    }
}
