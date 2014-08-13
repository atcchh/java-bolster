package com.cango.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by caoyanfei079 on 8/13/14.
 */
@Component
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

    public void onApplicationEvent(BlackListEvent event) {
        // notify appropriate parties via notificationAddress...
        System.out.println("notifier event : [" + event + "]");
    }
}
