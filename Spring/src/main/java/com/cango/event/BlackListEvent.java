package com.cango.event;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.context.ApplicationEvent;

/**
 * Created by caoyanfei079 on 8/13/14.
 */
public class BlackListEvent extends ApplicationEvent {

    private final String address;

    private final String test;

    public BlackListEvent(Object source, String address, String test) {
        super(source);
        this.address = address;
        this.test = test;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}