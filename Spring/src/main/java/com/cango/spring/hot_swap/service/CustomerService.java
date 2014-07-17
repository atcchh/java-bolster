package com.cango.spring.hot_swap.service;

import org.springframework.stereotype.Service;

/**
 * Created by caoyanfei079 on 7/16/14.
 */
//@Service("customerService")
public class CustomerService {
    public void buy() {
        System.out.println("CustomerService.buy : original");
    }
}
