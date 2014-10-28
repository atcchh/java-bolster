package com.cango.db.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by caoyanfei079 on 10/22/14.
 */
@Service
public class RechargeHistroyService {
    @Transactional(value = "TransactionManager1", propagation = Propagation.REQUIRES_NEW)
    public void insert() {
        throw new RuntimeException("failed insert");
    }

    @Transactional(value = "TransactionManager1", propagation = Propagation.REQUIRES_NEW)
    public void update() {
        System.out.println("RechargeHistroyService.update success");
    }
}
