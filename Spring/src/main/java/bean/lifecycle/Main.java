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
        System.out.println("　　　　　　实例化bean对象 " +
                "----->设置对象属性 " +
                "-----> 检查Aware相关接口并设置相关依赖" +
                "----->BeanPostProcess前置处理，检查是否是InitializingBean以决定是否调用afterPropertiesSet方法" +
                "----->检查是否配置有自定义的init-method  " +
                "-----> BeanPostProcessor 后置处理 " +
                "-----> 注册必要的Destruction相关回调接口 " +
                "-----> 使用 " +
                "-----> 是否实现DisposableBean " +
                "-----> 是否配置有自定义的destory方法");
    }
}
