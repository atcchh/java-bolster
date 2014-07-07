package com.cango.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by BJY on 2014/7/6.
 */
@Service
public class PeopleHistoryService  {
    @Autowired
    private PeopleService peopleService;

    public void updatePeople() {
        peopleService.updateName(1l,"Cango_PeopleHistoryService.updatePeople");
        peopleService.updateName2(2l, "peter_PeopleHistoryService.updatePeople");
    }
    public void updatePeople_2() {
        peopleService.updateName(1l,"Cango_PeopleHistoryService.updatePeople2");
        peopleService.updateName2(1l,"peter_PeopleHistoryService.updatePeople2");
    }
    @Transactional("TransactionManager1")
    public void updatePeople_3() {
        peopleService.updateName(1l,"Cango_PeopleHistoryService.updatePeople3");
        peopleService.updateName2(1l,"peter_PeopleHistoryService.updatePeople3");
    }

    @Transactional("TransactionManager1")
    public void updatePeople_3_2() {
        peopleService.updateName(1l,"Cango_PeopleHistoryService.updatePeople3_2");
        peopleService.updateName2_require_new(1l,"peter_PeopleHistoryService.updatePeople3_2");
    }
}
