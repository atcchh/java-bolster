package com.cango.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by caoyanfei079 on 10/22/14.
 */
@Service
@Transactional(value = "TransactionManager1" /*,propagation = Propagation.REQUIRES_NEW*/)
public class InnestMethod {
    @Autowired
    private RechargeHistroyService rechargeHistroyService;
    public void recharge(int i) {
        System.out.println();
        insertHistory();
        if(i == 0) {
            throw new RuntimeException("OfflineRecharge.recharge exception");
        }
    }
    public void insertHistory() {
        try {
            rechargeHistroyService.insert();
        }catch (Exception e) {
            System.out.println("OfflineRecharge.insertHistory : " + e.getMessage());
        }
        rechargeHistroyService.update();
    }
}
