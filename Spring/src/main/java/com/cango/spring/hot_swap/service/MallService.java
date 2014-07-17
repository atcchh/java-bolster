package com.cango.spring.hot_swap.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by caoyanfei079 on 7/16/14.
 */
@Service
@Transactional
public class MallService {
    @Autowired
    @Qualifier("customerService")
    private CustomerService customerService;
    public void list() {
        System.out.println("MallService.list : original");
        customerService.buy();
        throw new RuntimeException("----------------------------");
    }
}
