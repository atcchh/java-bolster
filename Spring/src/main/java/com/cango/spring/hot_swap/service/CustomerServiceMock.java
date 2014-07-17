package com.cango.spring.hot_swap.service;

import com.cango.spring.embeddedDataBase.service.*;
import org.springframework.stereotype.Service;

/**
 * Created by caoyanfei079 on 7/16/14.
 */

public class CustomerServiceMock extends CustomerService{
    public void buy() {
        System.out.println("CustomerServiceMock.buy : mock");
    }
}
