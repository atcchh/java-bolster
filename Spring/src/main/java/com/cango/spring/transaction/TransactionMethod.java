package com.cango.spring.transaction;

import bean.transaction1.TransactionConfig;
import com.cango.db.dao.PeopleDAO;
import com.cango.db.dto.People;
import com.cango.db.service.OfflineRecharge;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by caoyanfei079 on 10/22/14.
 */
public class TransactionMethod {
    public static void main(String[] argu) {
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        applicationContext.scan("com.cango.db");
        Executor executor = Executors.newFixedThreadPool(10);
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    OfflineRecharge offlineRecharge= applicationContext.getBean(OfflineRecharge.class);
                    offlineRecharge.batchRecharge();
                    System.out.println("success");
                }catch (Exception e) {
                    System.out.println("TransactionMethod.thread.exception " + e.getMessage());
                }
            }
        });
    }
}
