package com.cango.event.service;

import com.cango.event.BlackListEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caoyanfei079 on 8/13/14.
 */
@Service
public class EmailService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;


    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void sendEmail(String address, String text) {

            BlackListEvent event = new BlackListEvent(this, address, text);
            publisher.publishEvent(event);
            return;

    }
}