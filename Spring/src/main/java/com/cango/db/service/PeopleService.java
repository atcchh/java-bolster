package com.cango.db.service;

import com.cango.db.dao.PeopleDAO;
import com.cango.db.dto.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by BJY on 2014/7/6.
 */
@Service
public class PeopleService {
    @Autowired
    private PeopleDAO peopleDAO;
//    @Transactional("TransactionManager1")
//    public int updateName(Long peopleId, String newPeopleName) {
//        return peopleDAO.update(peopleId, newPeopleName);
//    }
    @Transactional("TransactionManager1")
    public int updateNameThrowRuntimeException(Long peopleId, String newPeopleName) {
        peopleDAO.update(peopleId, newPeopleName);
        throw new RuntimeException("after peopleDAO.update, throw RuntimeException");
    }

    @Transactional("TransactionManager1")
    public int updateNameThrowException(Long peopleId, String newPeopleName) throws Exception{
        peopleDAO.update(peopleId, newPeopleName);
        throw new Exception("after peopleDAO.update, throw Exception");
    }
    @Transactional(value="TransactionManager1", rollbackFor = Exception.class)
    public int updateNameThrowExceptionWithSetRollbackFor(Long peopleId, String newPeopleName) throws Exception{
        peopleDAO.update(peopleId, newPeopleName);
        throw new Exception("after peopleDAO.update, throw Exception");
    }
    @Transactional("TransactionManager2")
    public int updateName2(Long peopleId, String newPeopleName) {
        return peopleDAO.update(peopleId, newPeopleName);
    }

    @Transactional(value="TransactionManager2", propagation = Propagation.REQUIRES_NEW)
    public int updateName2_require_new(Long peopleId, String newPeopleName) {
        return peopleDAO.update(peopleId, newPeopleName);
    }

    public void updateNameWithoutTransaction() {
        updateName(1l, "test");
    }
    @Transactional("TransactionManager1")
    public int updateName(Long peopleId, String newPeopleName) {
        return peopleDAO.update(peopleId, newPeopleName);
    }
}
