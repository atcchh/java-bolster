package com.cango.db.service;

import com.cango.db.dao.PeopleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by BJY on 2014/7/6.
 */
@Service
@Transactional("TransactionManager1")
public class OfflineRecharge {
    @Autowired
    private PeopleDAO peopleDAO;
    @Autowired
    private InnestMethod innestMethod;

//    @Transactional("TransactionManager1")
//    public int updateName(Long peopleId, String newPeopleName) {
//        return peopleDAO.update(peopleId, newPeopleName);
//    }

    public void batchRecharge() {
        for(int i =0; i < 10; i++) {
            try {
                innestMethod.recharge(i);
            } catch (Exception e) {
                System.out.println("batchRecharge-exception : [" + e.getMessage() + "]");
            }
        }
    }



}

