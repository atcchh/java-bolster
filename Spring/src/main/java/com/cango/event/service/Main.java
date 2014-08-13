package com.cango.event.service;

import com.cango.event.BlackListNotifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by caoyanfei079 on 8/13/14.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(EmailService.class, BlackListNotifier.class);
        EmailService emailService = ctx.getBean(EmailService.class);
        emailService.sendEmail("caoyanfei079@pingan.com.cn","hello world");
    }
}
